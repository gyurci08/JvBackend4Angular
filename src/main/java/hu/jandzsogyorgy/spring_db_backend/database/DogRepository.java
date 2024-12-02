package hu.jandzsogyorgy.spring_db_backend.database;

import hu.jandzsogyorgy.spring_db_backend.entity.Dog;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends ListCrudRepository<Dog, Long> {

}