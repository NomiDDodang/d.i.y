package project.diy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.diy.domain.ProjectSpec;

import java.util.List;

public interface ProjectSpecRepository extends JpaRepository<ProjectSpec, String> {

    List<ProjectSpec> findByIsPublishedTrue();

}
