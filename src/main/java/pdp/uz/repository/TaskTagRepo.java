package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.TaskTag;

import java.util.UUID;

@Repository
public interface TaskTagRepo extends JpaRepository<TaskTag, UUID> {
}
