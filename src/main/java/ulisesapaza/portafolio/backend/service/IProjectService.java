package ulisesapaza.portafolio.backend.service;
import ulisesapaza.portafolio.backend.dto.ProjectDTO;

import java.util.List;

public interface IProjectService {
    List<ProjectDTO> getAllProjects();

    ProjectDTO getProjectById(Long id);

    ProjectDTO createProject(ProjectDTO projectDTO);

    ProjectDTO updateProject(Long id, ProjectDTO projectDTO);

    void deleteProject(Long id);
}
