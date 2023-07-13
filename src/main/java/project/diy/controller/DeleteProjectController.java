package project.diy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.DeleteProjectDto;
import project.diy.service.ProjectService;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DeleteProjectController {

    private final ProjectService projectService;

    @GetMapping("/project/delete")
    public Object deleteProject(@RequestBody DeleteProjectDto deleteProjectDto) {
        try {
            projectService.deleteProject(deleteProjectDto);
            return ResponseEntity.ok().build();
        } catch (Exception exception) {
            return ResponseEntity.status(500).build();
        }

    }

}
