package ulisesapaza.portafolio.backend.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String urlDemo;
    private String urlGithub;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser")
    private User user;
}
