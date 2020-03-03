package cynexx.springframework.cnxpetclinic.services;

import cynexx.springframework.cnxpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
