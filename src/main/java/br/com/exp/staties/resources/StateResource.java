package br.com.exp.staties.resources;

import br.com.exp.staties.entities.State;
import br.com.exp.staties.repositories.StateRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
REST Controller for 'states'
* CRUD methods
** GET "states" as a list
 */
@RestController
@RequestMapping("/staties")
public class StateResource {
  private final StateRepository repository;
  public StateResource(final StateRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<State> staties() {
    return repository.findAll();
  }
}
