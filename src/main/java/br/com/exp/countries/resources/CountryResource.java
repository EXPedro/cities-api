package br.com.exp.countries.resources;

import br.com.exp.countries.entities.Country;
import br.com.exp.countries.repositories.CountryRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
REST Controller for 'Country'
* CRUD methods
** GET as a list
 */
@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {
    return repository.findAll();
  }
}
