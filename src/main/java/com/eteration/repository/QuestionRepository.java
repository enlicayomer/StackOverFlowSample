package com.eteration.repository;


import java.util.List;

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
	@Modifying
	@Query(value="select * from question where user_id = ?1",nativeQuery=true)
	List<Question> getUserQuestionList(Long id);

}
