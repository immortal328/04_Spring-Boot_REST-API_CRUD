package ap.immortal.dataREST;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "humans")
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
