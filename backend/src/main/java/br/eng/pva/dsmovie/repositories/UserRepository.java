package br.eng.pva.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eng.pva.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email); // Method of JPA/Spring

}
