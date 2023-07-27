package project.diy.service;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.diy.domain.Project;
import project.diy.domain.dto.CreateProjectDto;
import project.diy.repository.ProjectRepository;

import java.util.Date;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
@ToString
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
                .projectModifiedDate(new Date())
                .build();
        if (projectRepository.existsById(createProjectDto.getProjectId())) {
            throw new Exception();
        } else {
            projectRepository.save(project);
        }
    }


    @Transactional(rollbackFor = Exception.class)
    public void deleteProject(String projectId) {
        projectRepository.deleteById(projectId);
    }


    public boolean loginProject(String projectId, String projectPassword) throws Exception {
        boolean findProject = projectPassword.equals(projectRepository.findById(projectId).orElseThrow(NoSuchElementException::new).getProjectPassword());
        return findProject;
    }

<<<<<<< Updated upstream
=======
    @Transactional(rollbackFor = Exception.class)
    public Map<Long,Object> createSpec(int page) {

        switch (page) {
            case 1:
                break;
            case 2:
                break;
        }

    }


>>>>>>> Stashed changes
}
