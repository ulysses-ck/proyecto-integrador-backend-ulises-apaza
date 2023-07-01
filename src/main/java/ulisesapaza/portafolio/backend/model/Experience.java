package ulisesapaza.portafolio.backend.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titleJob;
    private String nameCompany;
    private String workingDay;
    private String jobDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser")
    private User user;
}
