package ru.spb.microgeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.spb.microgeo.model.Country;
import ru.spb.microgeo.service.CountryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Country> getCountry(@RequestParam(required = false) String code) {
        return countryService.getCountries(code);
    }

}
