package ru.spb.microgeo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spb.microgeo.model.Country;
import ru.spb.microgeo.model.repository.CountryRepository;

import java.util.List;

import static ru.spb.microgeo.model.Country.getFromCountryEntities;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountries(String code) {
        if(code == null) {
            return getFromCountryEntities(countryRepository.findAll());
        } else {
            return getFromCountryEntities(countryRepository.findByCode(code));
        }
    }
}
