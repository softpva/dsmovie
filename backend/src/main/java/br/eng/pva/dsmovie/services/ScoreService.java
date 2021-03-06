package br.eng.pva.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.eng.pva.dsmovie.dto.MovieDTO;
import br.eng.pva.dsmovie.dto.ScoreDTO;
import br.eng.pva.dsmovie.entities.Movie;
import br.eng.pva.dsmovie.entities.Score;
import br.eng.pva.dsmovie.entities.User;
import br.eng.pva.dsmovie.repositories.MovieRepository;
import br.eng.pva.dsmovie.repositories.ScoreRepository;
import br.eng.pva.dsmovie.repositories.UserRepository;

// TODO: study this class

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository; // Object to access bd
		
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveSocre(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			// save and flush to db & return a new reference to object:
			user = userRepository.saveAndFlush(user); 					
		}
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		// save and flush to db & return a new reference to object:
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0;
		for ( Score s : movie.getScores()) {
			sum += s.getValue();
		}
		double avg = sum / movie.getScores().size();
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		// saving into database:
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
				
	}
	
	

}
