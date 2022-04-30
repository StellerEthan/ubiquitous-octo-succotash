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

		itemRepository.save(new Item("Ball","Round Ball","Garage", new GregorianCalendar(2025,01,24)));

		itemRepository.save(new Item("name","test","freezer", new GregorianCalendar(2023,10,30)));
	}

}
