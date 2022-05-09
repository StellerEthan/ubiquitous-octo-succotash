package Personal.StorageApp.controllers;

import Personal.StorageApp.models.Item;
import Personal.StorageApp.models.data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping(consumes = "application/json")
    public Item createItem(@RequestBody Item item){
        itemRepository.save(item);
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<Item> getItemByID(@PathVariable long id){
        Item item = itemRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Item does not exist with ID: " + id));
                return ResponseEntity.ok(item);
    }

    @PutMapping("{id}")
    public ResponseEntity<Item> updateItem(@PathVariable long id,@RequestBody Item itemDetails){
        Item updateItem = itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found with ID: "+id));
        updateItem.setItemName(itemDetails.getItemName());
        updateItem.setItemDesc(itemDetails.getItemDesc());
        updateItem.setItemLoc(itemDetails.getItemLoc());
        updateItem.setItemExp(itemDetails.getItemExp());

        itemRepository.save(updateItem);

        return ResponseEntity.ok(updateItem);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteItem(@PathVariable long id){
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found with ID: "+id));
        itemRepository.delete(item);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
