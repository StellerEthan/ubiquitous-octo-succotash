package Personal.StorageApp.controllers;

import Personal.StorageApp.models.data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(value = "/")
    public String index(){
        return"index";
    }

}
