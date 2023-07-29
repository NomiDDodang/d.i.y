package project.diy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.diy.domain.ProjectSpec;

public interface ProjectSpecRepository extends JpaRepository<ProjectSpec, String> {

}
