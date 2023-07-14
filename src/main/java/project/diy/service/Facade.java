package project.diy.service;

import project.diy.domain.Member;
import project.diy.domain.Project;
import project.diy.domain.dto.ProjectDto;

public class Facade {

    MemberService memberService;
    ProjectService projectService;

//    void createProject(ProjectService project, MemberService[] members) {
//        String projectId = projectService.createProject();
//        for(int i = 0; i < members.length; i++) {
//            memberService.addMember(projectId, members[i]);
//        }
//    }
}
