package project.diy.domain.dto;


import jakarta.persistence.EntityListeners;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class CreateSpecDto {
    String projectId;
    int userRegister;
    int userLogin;
    int userGubun;
    int userInfo;
    int funcSearch;
    int funcSort;
    int funcAllim;
    int actContent;
    int actBookmark;
    int actSubscribe;
    int actComment;
    int actMessage;
    int actChat;
}
