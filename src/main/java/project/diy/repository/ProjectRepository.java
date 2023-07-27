package project.diy.repository;

import jakarta.persistence.MapKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.diy.domain.Member;
import project.diy.domain.Project;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

    Project findByProjectPassword(String projectPassword);



}
