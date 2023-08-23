package project.diy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.diy.domain.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    public void deleteByMemberName(String memberName);

    Optional<Member> findByProjectIdAndMemberName(String ProjectId, String MemberName);
}
