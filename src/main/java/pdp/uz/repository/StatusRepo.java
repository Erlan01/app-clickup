package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.Status;

import java.util.List;
import java.util.UUID;

@Repository
public interface StatusRepo extends JpaRepository<Status, UUID> {
}
