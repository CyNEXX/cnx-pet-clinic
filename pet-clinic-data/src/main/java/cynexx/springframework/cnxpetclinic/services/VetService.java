package cynexx.springframework.cnxpetclinic.services;

import cynexx.springframework.cnxpetclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
