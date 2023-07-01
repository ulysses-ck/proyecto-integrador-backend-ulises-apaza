package ulisesapaza.portafolio.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulisesapaza.portafolio.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
