package ulisesapaza.portafolio.backend.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulisesapaza.portafolio.backend.dto.ExperienceDTO;
import ulisesapaza.portafolio.backend.model.Experience;
import ulisesapaza.portafolio.backend.repository.ExperienceRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExperienceService implements IExperienceService {
    private final ExperienceRepository experienceRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository, ModelMapper modelMapper) {
        this.experienceRepository = experienceRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ExperienceDTO> getAllExperiences() {
        List<Experience> experiences = experienceRepository.findAll();
        return experiences.stream()
                .map(experience -> modelMapper.map(experience, ExperienceDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ExperienceDTO getExperienceById(Long id) {
        Experience experience = experienceRepository.findById(id)
                .orElseThrow(null);
        return modelMapper.map(experience, ExperienceDTO.class);
    }

    @Override
    public ExperienceDTO createExperience(ExperienceDTO experienceDTO) {
        Experience experience = modelMapper.map(experienceDTO, Experience.class);
        Experience savedExperience = experienceRepository.save(experience);
        return modelMapper.map(savedExperience, ExperienceDTO.class);
    }

    @Override
    public ExperienceDTO updateExperience(Long id, ExperienceDTO experienceDTO) {
        Experience experience = experienceRepository.findById(id)
                .orElseThrow(null);
        modelMapper.map(experienceDTO, experience);
        Experience updatedExperience = experienceRepository.save(experience);
        return modelMapper.map(updatedExperience, ExperienceDTO.class);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }
}
