package project.diy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.diy.domain.dto.ProjectDto;
import project.diy.repository.ProjectRepository;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Boolean isDuplicatedId(String projectId) {
        return projectRepository.findById(projectId).isPresent();
    }

    @Transactional(rollbackFor = Exception.class)
    public void createProject(ProjectDto projectDto) throws Exception {

    }
}
