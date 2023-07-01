package ulisesapaza.portafolio.backend.service;

import ulisesapaza.portafolio.backend.dto.SkillDTO;

import java.util.List;

public interface ISkillService {
    List<SkillDTO> getAllSkills();

    SkillDTO getSkillById(Long id);

    SkillDTO createSkill(SkillDTO skillDTO);

    SkillDTO updateSkill(Long id, SkillDTO skillDTO);

    void deleteSkill(Long id);
}

