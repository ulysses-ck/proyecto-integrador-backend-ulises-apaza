package ulisesapaza.portafolio.backend.service;

import ulisesapaza.portafolio.backend.dto.EducationDTO;

import java.util.List;

public interface IEducationService {
    List<EducationDTO> getAllEducations();

    EducationDTO getEducationById(Long id);

    EducationDTO createEducation(EducationDTO educationDTO);

    EducationDTO updateEducation(Long id, EducationDTO educationDTO);

    void deleteEducation(Long id);
}
