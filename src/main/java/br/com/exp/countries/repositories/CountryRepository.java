package br.com.exp.countries.repositories;

import br.com.exp.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Spring Repository Country
 */
public interface CountryRepository extends JpaRepository<Country, Long> {
}
