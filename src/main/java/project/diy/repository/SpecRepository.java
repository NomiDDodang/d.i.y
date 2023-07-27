package project.diy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.diy.domain.Spec;
import project.diy.domain.dto.CreateSpecDto;

import java.util.List;

@Repository
public interface SpecRepository extends JpaRepository<Spec, String> {



}
