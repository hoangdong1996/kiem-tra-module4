package Repository;

import Model.City;
import org.springframework.data.repository.CrudRepository;


public interface CityRepository extends CrudRepository<City, Long> {
        }
