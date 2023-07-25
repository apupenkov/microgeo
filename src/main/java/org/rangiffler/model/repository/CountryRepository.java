package org.rangiffler.model.repository;


import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.rangiffler.model.entity.CountryEntity;

import java.util.List;
import java.util.UUID;


public interface CountryRepository extends JpaRepository<CountryEntity, UUID> {

    @Nonnull()
    CountryEntity findByCode(@Nonnull String code);

    @Nonnull()
    List<CountryEntity> findAll();

}