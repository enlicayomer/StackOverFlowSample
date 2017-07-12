package com.eteration.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eteration.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{
//
//	Optional<Question> findById(Long questionId);
//	

}
