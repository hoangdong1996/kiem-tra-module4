package Service.Impl;

import Model.City;
import Repository.CityRepository;
import Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findOne(id);
    }

    @Override
    public void remove(Long id) {
        cityRepository.delete(id);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }
}
