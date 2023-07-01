package ulisesapaza.portafolio.backend.dto;

import lombok.Data;

@Data
public class ProjectDTO {
    private Long id;
    private String name;
    private String description;
    private String urlDemo;
    private String urlGithub;
    private Long idUser;
}
