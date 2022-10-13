package com.switchfully.petinder;

import com.switchfully.petinder.petconstruction.PetDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "pets")
@RestController
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping(produces = "application/json")
    public List<PetDTO> helloPets(){
        return petService.getAllPets();
    }
}
