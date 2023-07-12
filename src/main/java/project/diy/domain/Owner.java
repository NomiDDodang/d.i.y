package project.diy.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "owner")
public class Owner {

    @Id
    @Column(name = "owner")
    private Long owner;
    private String ownerId;
    private String ownerName;
    private String ownerEmail;
}
