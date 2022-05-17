package Personal.StorageApp.models.data;

import Personal.StorageApp.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}