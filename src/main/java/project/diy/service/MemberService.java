package project.diy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.diy.domain.Member;
import project.diy.domain.dto.AddMemberDto;
import project.diy.domain.dto.DeleteMemberDto;
import project.diy.domain.dto.DeleteProjectDto;
import project.diy.repository.MemberRepository;
import project.diy.repository.ProjectRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final ProjectRepository projectRepository;

    public void addMember(AddMemberDto addMemberDto) {
        List<String> memberNameList = addMemberDto.getMemberNameList();
        for (String memberName : memberNameList) {
            Member member = Member.builder()
                    .memberName(memberName)
                    .projectId(addMemberDto.getProjectId()).build();
            memberRepository.save(member);
        }
    }

    public void deleteMember(DeleteMemberDto deleteMemberDto) {
        memberRepository.deleteByMemberNameAndProjectId(deleteMemberDto.getMemberName(), deleteMemberDto.getProjectId());
    }
}
