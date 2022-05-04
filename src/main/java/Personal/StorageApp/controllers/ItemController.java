package Personal.StorageApp.controllers;

import Personal.StorageApp.models.Item;
import Personal.StorageApp.models.data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/items")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemRepository.save(item);
    }
}
