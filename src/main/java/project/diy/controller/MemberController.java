package project.diy.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.diy.domain.dto.AddMemberDto;
import project.diy.domain.dto.DeleteMemberDto;
import project.diy.service.MemberService;
import project.diy.service.ProjectService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/project")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/add-member")
    public Object addMember (@RequestBody AddMemberDto addMemberDto) {
        memberService.addMember(addMemberDto);
        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/delete-member")
    public Object deleteMember (@RequestBody DeleteMemberDto deleteMemberDto) {
        memberService.deleteMember(deleteMemberDto);
        return ResponseEntity.ok().build();
    }
}
