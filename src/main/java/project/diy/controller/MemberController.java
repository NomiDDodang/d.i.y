package project.diy.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.AddMemberDto;
import project.diy.service.MemberService;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/{projectId}/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public Object addMember (@RequestBody AddMemberDto addMemberDto) {
        memberService.addMember(addMemberDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{memberName}")
    public Object deleteMember (@PathVariable(name="projectId") String projectId, @PathVariable(name="memberName") String memberName) {
        memberService.deleteMember(projectId, memberName);
        return ResponseEntity.ok().build();
    }
}
