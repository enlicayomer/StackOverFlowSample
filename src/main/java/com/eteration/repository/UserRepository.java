package com.eteration.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eteration.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	 User getUserById(Long id);
	 
	 User getUserByUserMail(String mail);
	 
	 
}
