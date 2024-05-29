package ap.immortal.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ap.immortal.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
