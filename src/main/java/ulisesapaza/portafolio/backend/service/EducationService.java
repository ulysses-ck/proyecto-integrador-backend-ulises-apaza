package ulisesapaza.portafolio.backend.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulisesapaza.portafolio.backend.dto.EducationDTO;
import ulisesapaza.portafolio.backend.model.Education;
import ulisesapaza.portafolio.backend.repository.EducationRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducationService implements IEducationService {
    private final EducationRepository educationRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EducationService(EducationRepository educationRepository, ModelMapper modelMapper) {
        this.educationRepository = educationRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<EducationDTO> getAllEducations() {
        List<Education> educations = educationRepository.findAll();
        return educations.stream()
                .map(education -> modelMapper.map(education, EducationDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public EducationDTO getEducationById(Long id) {
        Education education = educationRepository.findById(id)
                .orElse(null);
        return modelMapper.map(education, EducationDTO.class);
    }

    @Override
    public EducationDTO createEducation(EducationDTO educationDTO) {
        Education education = modelMapper.map(educationDTO, Education.class);
        Education savedEducation = educationRepository.save(education);
        return modelMapper.map(savedEducation, EducationDTO.class);
    }

    @Override
    public EducationDTO updateEducation(Long id, EducationDTO educationDTO) {
        Education education = educationRepository.findById(id)
                .orElse(null);
        modelMapper.map(educationDTO, education);
        Education updatedEducation = educationRepository.save(education);
        return modelMapper.map(updatedEducation, EducationDTO.class);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }
}
