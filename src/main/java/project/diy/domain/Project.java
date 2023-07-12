package project.diy.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "project")
    private Long project;
    private Stirng projectId;
    private String projectName;
    private String projectDescription;
    private Stiring ownerId;
    private String memberId;

}
