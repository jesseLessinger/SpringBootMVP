package nasapod.Service;

import nasapod.Entity.NasaPic;
import nasapod.Repository.PicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    @Autowired
    private PicRepo picRepo;

    public void save(NasaPic pic) {
        picRepo.save(pic);
    }

    public Iterable<NasaPic> findAll() {
        return picRepo.findAll();
    }
}
