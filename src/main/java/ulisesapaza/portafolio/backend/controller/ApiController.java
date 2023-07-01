package ulisesapaza.portafolio.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ulisesapaza.portafolio.backend.dto.EducationDTO;
import ulisesapaza.portafolio.backend.service.IEducationService;
import ulisesapaza.portafolio.backend.service.IExperienceService;
import ulisesapaza.portafolio.backend.service.IProjectService;
import ulisesapaza.portafolio.backend.service.ISkillService;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private IEducationService educationService;
    @Autowired
    private IExperienceService experienceService;
    @Autowired
    private ISkillService skillService;
    @Autowired
    private IProjectService projectService;

    @GetMapping(value="/")
    public String helloWorld() {
        return "hello!!";
    }

    @GetMapping("education/get-all")
    public ResponseEntity<List<EducationDTO>> getAllEducations() {
        List<EducationDTO> educations = educationService.getAllEducations();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }

    public ResponseEntity<EducationDTO> createEducation(@RequestBody EducationDTO educationDTO) {
        EducationDTO createdEducation = educationService.createEducation(educationDTO);
        return new ResponseEntity<>(createdEducation, HttpStatus.CREATED);
    }
}
