package ulisesapaza.portafolio.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulisesapaza.portafolio.backend.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
