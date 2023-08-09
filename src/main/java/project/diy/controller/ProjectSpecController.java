package project.diy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import project.diy.domain.dto.SpecificationDto;
import project.diy.domain.dto.CreateProjectSpecDto;
import project.diy.service.ProjectSpecService;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/{projectId}")
public class ProjectSpecController {

    final ProjectSpecService projectSpecService;

    @PutMapping ("/create-specification")
    public ResponseEntity<Object> createSpec(@RequestBody CreateProjectSpecDto createProjectSpecDto) {
        projectSpecService.createSpec(createProjectSpecDto);
        return ResponseEntity.ok().build();
    }

}