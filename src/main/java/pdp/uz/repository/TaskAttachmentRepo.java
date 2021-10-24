package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.TaskAttachment;

import java.util.UUID;

@Repository
public interface TaskAttachmentRepo extends JpaRepository<TaskAttachment, UUID> {
}
