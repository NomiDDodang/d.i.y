package project.diy.service.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.diy.domain.dto.LoginDto;
import project.diy.service.MemberService;
import project.diy.service.ProjectService;

import java.util.NoSuchElementException;


@Service
@RequiredArgsConstructor
public class LoginFacade {

    private final ProjectService projectService;
    private final MemberService memberService;

    public void login(LoginDto loginDto) throws Exception {
        if (projectService.loginProject(loginDto.getProjectId(), loginDto.getProjectPassword())) {
            memberService.loginMember(loginDto.getProjectId(), loginDto.getMemberName());
        }
        else throw new NoSuchElementException();


    }

}


