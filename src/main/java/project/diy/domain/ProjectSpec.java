package project.diy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table (name = "project_spec")
public class ProjectSpec {

    @Id
    @Column(name = "project_id")
    String projectId;
    Long userRegister;
    Long userLogin;
    Long userGubun;
    Long userInfo;
    Long funcSearch;
    Long funcSort;
    Long funcAllim;
    Long actContent;
    Long actBookmark;
    Long actSubscribe;
    Long actComment;
    Long actMessage;
    Long actChat;
    Date latestSavedDate;

}
