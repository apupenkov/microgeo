package org.rangiffler.model;

import org.rangiffler.model.entity.CountryEntity;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class CountryJson {

    private UUID id;

    private String code;

    private String name;

    public CountryJson() {}

    public CountryJson(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static List<CountryJson> getFromCountryEntities(List<CountryEntity> entity) {
        return entity.stream().map(country -> new CountryJson(
                country.getCode(),
                country.getName()
        )).collect(Collectors.toList());
    }

    public static CountryJson getFromCountryEntity(CountryEntity entity) {
        return new CountryJson(
            entity.getCode(),
            entity.getName()
        );
    }
}
