package project.diy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.diy.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

    Project findByProjectPassword(String projectPassword);

}
