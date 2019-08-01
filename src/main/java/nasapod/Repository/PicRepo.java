package nasapod.Repository;

import nasapod.Entity.NasaPic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PicRepo extends CrudRepository<NasaPic, Integer>{

}
