package project.diy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.diy.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
}
