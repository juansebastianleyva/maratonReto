package usa.mintic.retos.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.retos.entity.Client;
import usa.mintic.retos.entity.Library;

public interface LibraryCrudRepository extends CrudRepository<Library,Integer> {
}
