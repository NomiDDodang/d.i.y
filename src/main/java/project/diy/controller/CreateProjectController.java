package project.diy.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.ProjectDto;
import project.diy.domain.dto.ProjectIdDuplicateResponseDto;
import project.diy.service.ProjectService;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CreateProjectController {

    private final ProjectService projectService;

    @GetMapping("/create-project/{projectId}")
    public ResponseEntity isDuplicate(@PathVariable(name = "projectId") String projectId) {
        Boolean result = projectService.isDuplicatedId(projectId);
        ProjectIdDuplicateResponseDto projectIdDuplicateResponseDto = ProjectIdDuplicateResponseDto.builder().isDuplicatedId(result).build();
        return ResponseEntity.ok(projectIdDuplicateResponseDto);
    }



    @PostMapping("/create-project/submit")
    public Object createProject(@RequestBody ProjectDto projectDto) {
        ProjectDto.builder().build();
        return ResponseEntity.ok();
    }


}
