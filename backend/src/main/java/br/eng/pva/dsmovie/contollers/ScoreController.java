package br.eng.pva.dsmovie.contollers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eng.pva.dsmovie.dto.MovieDTO;
import br.eng.pva.dsmovie.dto.ScoreDTO;


@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@PutMapping(value = "/{id}")
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		return null;		
	}

}
