package org.rangiffler.service;

import org.rangiffler.model.CountryJson;
import org.rangiffler.model.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("countryService")
@Qualifier("rest")
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryJson> getCountries() {
        return CountryJson.getFromCountryEntities(countryRepository.findAll());
    }

    public CountryJson getCountry(String code) {
        return CountryJson.getFromCountryEntity(countryRepository.findByCode(code));
    }
}
