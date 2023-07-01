package ulisesapaza.portafolio.backend.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulisesapaza.portafolio.backend.dto.SkillDTO;
import ulisesapaza.portafolio.backend.model.Skill;
import ulisesapaza.portafolio.backend.repository.SkillRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillService implements ISkillService {
    private final SkillRepository skillRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public SkillService(SkillRepository skillRepository, ModelMapper modelMapper) {
        this.skillRepository = skillRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<SkillDTO> getAllSkills() {
        List<Skill> skills = skillRepository.findAll();
        return skills.stream()
                .map(skill -> modelMapper.map(skill, SkillDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public SkillDTO getSkillById(Long id) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(null);
        return modelMapper.map(skill, SkillDTO.class);
    }

    @Override
    public SkillDTO createSkill(SkillDTO skillDTO) {
        Skill skill = modelMapper.map(skillDTO, Skill.class);
        Skill savedSkill = skillRepository.save(skill);
        return modelMapper.map(savedSkill, SkillDTO.class);
    }

    @Override
    public SkillDTO updateSkill(Long id, SkillDTO skillDTO) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(null);
        modelMapper.map(skillDTO, skill);
        Skill updatedSkill = skillRepository.save(skill);
        return modelMapper.map(updatedSkill, SkillDTO.class);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
}
