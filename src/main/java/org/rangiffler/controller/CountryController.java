package org.rangiffler.controller;

import org.rangiffler.model.CountryJson;
import org.rangiffler.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<CountryJson> getCountries() {
        return countryService.getCountries();
    }

    @GetMapping("/country")
    public CountryJson getCountry(@RequestParam String code) {
        return countryService.getCountry(code);
    }

}
