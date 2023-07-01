package ulisesapaza.portafolio.backend.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String fullName;
    private String aboutMe;
    private String email;
    private String password;
    private String photoProfile;
}
