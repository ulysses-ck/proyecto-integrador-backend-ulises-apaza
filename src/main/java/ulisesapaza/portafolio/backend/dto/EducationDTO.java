package ulisesapaza.portafolio.backend.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EducationDTO {
    private Long id;
    private String title;
    private String logo;
    private String nameInstitution;
    private LocalDate startDate;
    private LocalDate finishDate;
    private Long idUser;
}
