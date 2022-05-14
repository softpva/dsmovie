package br.eng.pva.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eng.pva.dsmovie.entities.Score;
import br.eng.pva.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
