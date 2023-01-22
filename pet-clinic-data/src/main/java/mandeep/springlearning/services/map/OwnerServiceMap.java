package mandeep.springlearning.services.map;

import mandeep.springlearning.models.Owner;
import mandeep.springlearning.services.CrudService;
import mandeep.springlearning.services.map.AbstractMapService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super. delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
