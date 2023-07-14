package project.diy.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.CreateProjectDto;
import project.diy.domain.dto.CreateProjectResponseDto;
import project.diy.domain.dto.ProjectIdDuplicateResponseDto;
import project.diy.service.ProjectService;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CreateProjectController {

    private final ProjectService projectService;

    @GetMapping("/project/is-duplicated-id/{projectId}")
    public ResponseEntity isDuplicate(@PathVariable(name = "projectId") String projectId) {
        Boolean result = projectService.isDuplicatedId(projectId);
        ProjectIdDuplicateResponseDto projectIdDuplicateResponseDto = ProjectIdDuplicateResponseDto.builder().isDuplicatedId(result).build();
        return ResponseEntity.ok(projectIdDuplicateResponseDto);
    }


    @PutMapping("/project/submit")
    public Object createProject(@RequestBody CreateProjectDto createProjectDto) {
        try {
            projectService.createProject(createProjectDto);
            return ResponseEntity.ok().build();
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatusCode.valueOf(409)).body(new CreateProjectResponseDto().isDuplicate());
        }
    }


}
