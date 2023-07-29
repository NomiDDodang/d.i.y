package project.diy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.diy.domain.Member;
import project.diy.domain.dto.AddMemberDto;
import project.diy.repository.MemberRepository;

import java.util.Date;
import java.util.List;


@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional(rollbackFor = Exception.class)
    public void addMember(AddMemberDto addMemberDto) {
        List<String> memberNameList = addMemberDto.getMemberNameList();
        for (String memberName : memberNameList) {
            Member member = Member.builder()
                    .memberName(memberName)
                    .projectId(addMemberDto.getProjectId())
                    .build();
            memberRepository.save(member);
        }
    }

    public void deleteMember(String projectId, String memberName) {
        memberRepository.deleteByProjectIdAndMemberName(projectId, memberName);
    }


    public boolean existsMember(String projectId, String memberName) {
        boolean findMember = memberRepository.findByProjectIdAndMemberName(projectId, memberName).isPresent();
        return findMember;
    }

    public void loginMember(String projectId, String memberName){
       Member findMember = memberRepository.findByProjectIdAndMemberName(projectId, memberName).orElseThrow();
       Member loginMember = Member.builder()
               .memberId(findMember.getMemberId())
               .memberName((findMember.getMemberName()))
               .lastLogin(new Date())
               .projectId(findMember.getProjectId())
               .build();
       memberRepository.save(loginMember);
    }
}
