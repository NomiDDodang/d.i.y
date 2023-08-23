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
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "project_id")
    private String projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_password")
    private String projectPassword;

    @Column(name = "project_desc")
    private String projectDescription;

    @Column(name = "progress_status")
    private String progressStatus;

    @Column(name = "created_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date projectCreatedDate;

    @Column(name = "latest_mdfy_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date projectModifiedDate; //가장 최근 수정된 시간


}
