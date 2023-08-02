package project.diy.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.CreateProjectDto;
import project.diy.domain.dto.response_message_dto.CreateProjectResponseDto;
import project.diy.domain.dto.response_message_dto.ProjectIdDuplicateResponseDto;
import project.diy.service.ProjectService;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/{projectId}")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping("/is-duplicated-id")
    public ResponseEntity<ProjectIdDuplicateResponseDto> isDuplicate(@PathVariable(name = "projectId") String projectId) {
        Boolean result = projectService.isDuplicatedId(projectId);
        ProjectIdDuplicateResponseDto projectIdDuplicateResponseDto = ProjectIdDuplicateResponseDto.builder().isDuplicatedId(result).build();
        return ResponseEntity.ok(projectIdDuplicateResponseDto);
    }

    @PutMapping
    public Object createProject(@RequestBody CreateProjectDto createProjectDto) {
        try {
            projectService.createProject(createProjectDto);
            return ResponseEntity.ok().build();
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatusCode.valueOf(409)).body(new CreateProjectResponseDto().isDuplicate());
        }
    }

    @DeleteMapping("/delete-project")
    public Object deleteProject(@PathVariable(name = "projectId") String projectId) {
        try {
            projectService.deleteProject(projectId);
            return ResponseEntity.ok().build();
        } catch (Exception exception) {
            return ResponseEntity.status(500).build();
        }
    }


}
