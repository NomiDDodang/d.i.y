package project.diy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.diy.domain.ProjectSpec;
import project.diy.domain.dto.CreateSpecDto;
import project.diy.repository.ProjectSpecRepository;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ProjectSpecService {

    private final ProjectSpecRepository projectSpecRepository;

    @Transactional(rollbackFor = Exception.class)
    public void createSpec(CreateSpecDto createSpecDto) {
        ProjectSpec projectSpec = ProjectSpec.builder()
                .projectId(createSpecDto.getProjectId())
                .specInfo(createSpecDto.getSpecInfo())
                .lastSavedDate(new Date())
                .build();

        ProjectSpec test = projectSpecRepository.save(projectSpec);
    }
}
