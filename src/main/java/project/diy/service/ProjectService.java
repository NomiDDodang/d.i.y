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

    /*
     * CASCADE로 외래키를 만들긴 했지만, member repository를 가져와서 그 곳의 정보도 삭제하는 로직을 넣고 싶어요!
     */
    @Transactional(rollbackFor = Exception.class)
    public void deleteProject(DeleteProjectDto deleteProjectDto) {
        projectRepository.deleteById(deleteProjectDto.getProjectId());
    }


}
