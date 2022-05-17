package Personal.StorageApp;

import Personal.StorageApp.models.Item;
import Personal.StorageApp.models.Location;
import Personal.StorageApp.models.data.ItemRepository;
import Personal.StorageApp.models.data.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.GregorianCalendar;

@SpringBootApplication
public class StorageAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(StorageAppApplication.class, args);
	}

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private LocationRepository locationRepository;

}
