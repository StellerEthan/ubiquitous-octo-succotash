package Personal.StorageApp.models.data;

import Personal.StorageApp.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
