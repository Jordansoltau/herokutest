package com.switchfully.petinder;

import com.switchfully.petinder.petconstruction.Pet;
import com.switchfully.petinder.petconstruction.PetDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class PetMapper {

    public List<PetDTO> toDTOList(List<Pet> listOfPets) {
        return listOfPets.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public PetDTO toDTO(Pet pet){
        return new PetDTO(pet.getId(), pet.getName(),pet.getKindOfPet(), pet.getProfileText());
    }

}
