package project.diy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.diy.domain.Project;
import project.diy.domain.dto.CreateProjectDto;
import project.diy.domain.dto.DeleteProjectDto;
import project.diy.repository.ProjectRepository;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Boolean isDuplicatedId(String projectId) {
        return projectRepository.findById(projectId).isPresent();
    }

    @Transactional(rollbackFor = Exception.class)
    public void createProject(CreateProjectDto createProjectDto) throws Exception {
        Project project = Project.builder()
                .projectId(createProjectDto.getProjectId())
                .projectName(createProjectDto.getProjectName())
                .projectPassword(createProjectDto.getProjectPassword())
                .projectDescription(createProjectDto.getProjectDescription())
                .projectCreatedDate(new Date())
                .build();
        if (projectRepository.existsById(createProjectDto.getProjectId())) {
            throw new Exception();
        }
        else {
            projectRepository.save(project);
        }
    }


    @Transactional(rollbackFor = Exception.class)
    public void deleteProject(DeleteProjectDto deleteProjectDto) {
        projectRepository.deleteById(deleteProjectDto.getProjectId());
    }


}
