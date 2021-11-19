package br.com.exp.staties.repositories;

import br.com.exp.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Spring Repository State
 */
public interface StateRepository extends JpaRepository<State, Long> {
}
