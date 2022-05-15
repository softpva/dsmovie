package br.eng.pva.dsmovie.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eng.pva.dsmovie.dto.MovieDTO;
import br.eng.pva.dsmovie.dto.ScoreDTO;
import br.eng.pva.dsmovie.services.ScoreService;


@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO movieDto = service.saveSocre(dto);
		return movieDto;		
	}

}


// To access h2 db use the url: localhost:8080/h2-console