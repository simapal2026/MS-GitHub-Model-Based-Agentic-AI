package com.ai_automation.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ai_automation.example.demo.model.User;

@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	
	User findByTcno(String tcno);

}
