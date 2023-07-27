package project.diy.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.LoginDto;
import project.diy.service.facade.LoginFacade;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/{projectId}")
public class LoginController {

    private final LoginFacade loginFacade;

    @GetMapping("/login")
    public Object login(@RequestBody LoginDto loginDto) throws Exception {

        try {
            loginFacade.login(loginDto);
            return ResponseEntity.ok();
        } catch (Exception exception) {
            return ResponseEntity.badRequest().build();
        }

    }

}
