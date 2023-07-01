package ulisesapaza.portafolio.backend.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulisesapaza.portafolio.backend.dto.ProjectDTO;
import ulisesapaza.portafolio.backend.model.Project;
import ulisesapaza.portafolio.backend.repository.ProjectRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService implements IProjectService {
    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ProjectService(ProjectRepository projectRepository, ModelMapper modelMapper) {
        this.projectRepository = projectRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ProjectDTO> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream()
                .map(project -> modelMapper.map(project, ProjectDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProjectDTO getProjectById(Long id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(null);
        return modelMapper.map(project, ProjectDTO.class);
    }

    @Override
    public ProjectDTO createProject(ProjectDTO projectDTO) {
        Project project = modelMapper.map(projectDTO, Project.class);
        Project savedProject = projectRepository.save(project);
        return modelMapper.map(savedProject, ProjectDTO.class);
    }

    @Override
    public ProjectDTO updateProject(Long id, ProjectDTO projectDTO) {
        Project project = projectRepository.findById(id)
                .orElseThrow(null);
        modelMapper.map(projectDTO, project);
        Project updatedProject = projectRepository.save(project);
        return modelMapper.map(updatedProject, ProjectDTO.class);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
