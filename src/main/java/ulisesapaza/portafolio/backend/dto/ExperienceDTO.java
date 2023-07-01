package ulisesapaza.portafolio.backend.dto;

import lombok.Data;

@Data
public class ExperienceDTO {
    private Long id;
    private String titleJob;
    private String nameCompany;
    private String workingDay;
    private String jobDescription;
    private Long idUser;
}