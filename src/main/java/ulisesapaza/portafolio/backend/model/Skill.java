package ulisesapaza.portafolio.backend.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int domainPercentage;
    private String accentColor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser")
    private User user;
}
