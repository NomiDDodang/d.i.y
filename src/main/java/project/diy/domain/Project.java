package project.diy.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "project_id")
    private String projectId;
    private String projectName;
    private String projectPassword;
    private String projectDescription;

}
