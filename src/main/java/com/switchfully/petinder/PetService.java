package com.switchfully.petinder;

import com.switchfully.petinder.petconstruction.PetDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PetService {
   private final PetMapper petMapper;
   private final PetRepositry petRepositry;

    public PetService(PetMapper petMapper, PetRepositry petRepositry) {
        this.petMapper = petMapper;
        this.petRepositry = petRepositry;
    }

    public List<PetDTO> getAllPets(){
        return petMapper.toDTOList(petRepositry.getAllPets());
    }
}
