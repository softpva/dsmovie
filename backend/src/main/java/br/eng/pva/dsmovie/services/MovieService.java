package br.eng.pva.dsmovie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.eng.pva.dsmovie.dto.MovieDTO;
import br.eng.pva.dsmovie.entities.Movie;
import br.eng.pva.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	// return a page(s) 
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;	
		
	}
	
	// return a movie
	@Transactional(readOnly = true)
	public MovieDTO findBYId(Long id) {
		Movie result = repository.findById(id).get();
		MovieDTO  dto = new MovieDTO(result);
		return dto;	
		
	}

}
