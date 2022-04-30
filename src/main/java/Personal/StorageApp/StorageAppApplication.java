package Personal.StorageApp;

import Personal.StorageApp.models.Item;
import Personal.StorageApp.models.data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.GregorianCalendar;

@SpringBootApplication
public class StorageAppApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StorageAppApplication.class, args);
	}

	@Autowired
	private ItemRepository itemRepository;


	@Override
	public void run(String... args) throws Exception {
		Item item = new Item();
		item.setName("Ball");
		item.setItemDesc("Round ball");
		item.setExp(new GregorianCalendar(2023, 10, 30));
		item.setItemLoc("Garage");
		itemRepository.save(item);

		Item item2 = new Item();
		item.setName("Ice Cubes");
		item.setItemDesc("Frozen Cube of Water");
		item.setExp(new GregorianCalendar(2039, 10, 30));
		item.setItemLoc("Freezer");
		itemRepository.save(item2);
	}

}
