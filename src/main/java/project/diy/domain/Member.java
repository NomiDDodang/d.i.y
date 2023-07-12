package project.diy.domain;


import lombok.*;
import jakarta.persistence.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "member")
    private Long member;
    private String memberId;
    private String memberName;

}
