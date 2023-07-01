package ulisesapaza.portafolio.backend.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String aboutMe;
    private String email;
    private String password;
    private String photoProfile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Education> educationList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Experience> experienceList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Project> projectList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Skill> skillList;
}