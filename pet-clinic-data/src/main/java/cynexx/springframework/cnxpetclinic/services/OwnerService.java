package cynexx.springframework.cnxpetclinic.services;

import cynexx.springframework.cnxpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
