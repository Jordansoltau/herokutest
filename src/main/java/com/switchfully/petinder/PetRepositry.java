package com.switchfully.petinder;

import com.switchfully.petinder.petconstruction.Kind;
import com.switchfully.petinder.petconstruction.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class PetRepositry {

    public List<Pet> getAllPets(){
        return List.of(new Pet(1,"tequila", Kind.CAT,"aggressive cat")
        ,new Pet(2,"Ruby",Kind.DOG,"Friendly dog"));
    }
}
