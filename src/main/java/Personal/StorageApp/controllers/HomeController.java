package Personal.StorageApp.controllers;

import Personal.StorageApp.models.Item;
import Personal.StorageApp.models.data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/items")
public class HomeController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(value = "/")
    public List<Item> getAllItems(){
        return (List<Item>) itemRepository.findAll();
    }

}
