package com.eteration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eteration.entity.Answer;

@Repository
public interface AnswerRepository  extends JpaRepository<Answer, Long>{

	@Modifying
	@Query(value="select * from answer where question_id= ?1",nativeQuery=true)
	List<Answer> findByAnswerWhereQuesionId(Long id); 
	
	@Modifying
	@Query(value="select * from answer where user_id = ?1",nativeQuery=true)
	List<Answer> getUserAnswers(Long id);
}
