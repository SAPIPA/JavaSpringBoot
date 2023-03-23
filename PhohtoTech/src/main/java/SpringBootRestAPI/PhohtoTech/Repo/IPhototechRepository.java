package SpringBootRestAPI.PhohtoTech.Repo;

import SpringBootRestAPI.PhohtoTech.models.Phototech;
import org.springframework.data.repository.CrudRepository;

public interface IPhototechRepository extends CrudRepository<Phototech, Long> {

}
/*import SpringBootRestAPI.PhohtoTech.models.Phototech;
public interface IPhototechRepository {

    Phototech findAll();
    Phototech findById(long id);
    Phototech save(Phototech image);
    Phototech delete(long id);

}*/
