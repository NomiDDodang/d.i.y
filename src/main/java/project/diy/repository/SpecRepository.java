package project.diy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.diy.domain.Spec;

@Repository
public interface SpecRepository extends JpaRepository<Spec, String> {


}
