package br.com.exp.cities.resources;

import br.com.exp.cities.entities.City;
import br.com.exp.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
REST Controller for 'cities'
* CRUD methods ( only GET is used here)
 */
@RestController
@RequestMapping("cities")
public class CityResource {
  private final CityRepository repository;

  public CityResource(final CityRepository repository) {
    this.repository = repository;
  }

  /* 1st (get a lot of data as a List)
  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }*/

  // 2nd - Spring Pageable (get a lot of data organized in pages)
  @GetMapping
  public Page<City> cities(final Pageable page) {
    return repository.findAll(page);
  }
}
