package ulisesapaza.portafolio.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulisesapaza.portafolio.backend.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
