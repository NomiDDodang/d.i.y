package project.diy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.CreateSpecDto;
import project.diy.service.ProjectService;
import project.diy.service.ProjectSpecService;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/{projectId}")
public class ProjectSpecController {

    final ProjectSpecService projectSpecService;

    @PutMapping("/create-specification")
    public ResponseEntity createSpec(@RequestBody CreateSpecDto createSpecDto) {
        projectSpecService.createSpec(createSpecDto);
        return ResponseEntity.ok().build();
    }

}
