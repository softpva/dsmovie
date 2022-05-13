package br.eng.pva.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eng.pva.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
