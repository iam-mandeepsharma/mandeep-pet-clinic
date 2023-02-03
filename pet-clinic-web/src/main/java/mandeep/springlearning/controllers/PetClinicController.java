package mandeep.springlearning.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pet-clinic")
public class PetClinicController {

    @GetMapping("/fetch")
    public ResponseEntity fetchPetDetails(){
        return ResponseEntity.ok().build();
    }
}
