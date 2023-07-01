package ulisesapaza.portafolio.backend.model;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String logo;
    private String nameInstitution;
    private LocalDate startDate;
    private LocalDate finishDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser")
    private User user;
}