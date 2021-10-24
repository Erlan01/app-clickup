package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.ProjectUser;

import java.util.UUID;

@Repository
public interface ProjectUserRepo extends JpaRepository<ProjectUser, UUID> {
}
