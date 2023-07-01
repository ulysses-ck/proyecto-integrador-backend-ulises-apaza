package ulisesapaza.portafolio.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulisesapaza.portafolio.backend.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
