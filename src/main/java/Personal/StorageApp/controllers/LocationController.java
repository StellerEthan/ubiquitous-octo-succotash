package Personal.StorageApp.controllers;

import Personal.StorageApp.models.Location;
import Personal.StorageApp.models.data.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/location")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @PostMapping(consumes = "application/json")
    public Location createLocation(@RequestBody Location location){
        locationRepository.save(location);
        return null;
    }

    @GetMapping("(id}")
    public ResponseEntity<Location> getLocationById(@PathVariable long id){
        Location location = locationRepository.findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("No location with ID: "+id));
                return ResponseEntity.ok(location);
    }
}
