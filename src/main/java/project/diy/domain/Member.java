package project.diy.domain;


import lombok.*;
import jakarta.persistence.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "member_id")
    private Long memberId;
    private String memberName;
    private Long projectId;

}
