package Service.Impl;

import Model.Country;
import Repository.CountryRepository;
import Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return (List<Country>) countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return countryRepository.findOne(id);
    }

    @Override
    public void remove(Long id) {
        countryRepository.delete(id);
    }

    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }
}
