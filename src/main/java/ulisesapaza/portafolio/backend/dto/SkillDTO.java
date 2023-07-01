package ulisesapaza.portafolio.backend.dto;

import lombok.Data;

@Data
public class SkillDTO {
    private Long id;
    private String name;
    private int domainPercentage;
    private String accentColor;
    private Long idUser;
}