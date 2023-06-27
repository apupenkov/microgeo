package ru.spb.microgeo.model;

import ru.spb.microgeo.model.entity.CountryEntity;
import ru.spb.microgeo.model.repository.CountryRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Country {

    private final String code, name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static List<Country> getFromCountryEntities(List<CountryEntity> entity) {
        return entity.stream().map(country -> new Country(
                country.getCode(),
                country.getName()
        )).collect(Collectors.toList());
    }
}
