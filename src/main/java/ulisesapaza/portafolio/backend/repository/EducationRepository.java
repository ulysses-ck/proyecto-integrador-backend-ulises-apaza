package ulisesapaza.portafolio.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulisesapaza.portafolio.backend.model.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
}
