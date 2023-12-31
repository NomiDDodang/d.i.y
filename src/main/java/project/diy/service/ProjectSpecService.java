package project.diy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.diy.domain.ProjectSpec;
import project.diy.domain.dto.CreateProjectSpecDto;
import project.diy.repository.ProjectSpecRepository;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ProjectSpecService {

    private final ProjectSpecRepository projectSpecRepository;

    @Transactional(rollbackFor = Exception.class)
    public void createSpec(CreateProjectSpecDto createProjectSpecDto) {
        ProjectSpec projectSpec = ProjectSpec.builder()
                .projectId(createProjectSpecDto.getProjectId())
                .specInfo(createProjectSpecDto.getSpecInfo())
                .lastSavedDate(new Date())
                .build();

        projectSpecRepository.save(projectSpec);
    }
    

}
