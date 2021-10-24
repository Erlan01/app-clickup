package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.SpaceView;

import java.util.List;
import java.util.UUID;

@Repository
public interface SpaceViewRepo extends JpaRepository<SpaceView, UUID> {
}
