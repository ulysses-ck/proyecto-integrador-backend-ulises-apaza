package ulisesapaza.portafolio.backend.service;

import ulisesapaza.portafolio.backend.dto.ExperienceDTO;

import java.util.List;

public interface IExperienceService {
    List<ExperienceDTO> getAllExperiences();

    ExperienceDTO getExperienceById(Long id);

    ExperienceDTO createExperience(ExperienceDTO experienceDTO);

    ExperienceDTO updateExperience(Long id, ExperienceDTO experienceDTO);

    void deleteExperience(Long id);
}
