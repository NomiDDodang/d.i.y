package project.diy.controller;



import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {


    @PostMapping("/admin")
    public ResponseEntity<T> admin(@RequestBody OwnerLoginDto ownerLoginDtoDto) {
    }

    @PostMapping("/member")
    public ResponseEntity<T> member(@RequestBody Member member) {

    }
}
