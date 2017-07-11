package com.eteration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.entity.Answer;
import com.eteration.repository.AnswerRepository;

@RestController
@RequestMapping("a")
public class AnswerController {

	@Autowired
	private AnswerRepository answerRepository;

	@PostMapping("add")
	public ResponseEntity<Answer> addAnswer(@RequestBody Answer answer)
	{
		return new ResponseEntity<Answer>(answerRepository.save(new Answer(answer.getBody(), answer.getDate(), answer.getAuthor(), answer.getQuestion())),HttpStatus.CREATED);
	}
	
	@DeleteMapping("delete/{answerId}")
	public ResponseEntity<Void> deleteAnswer(@PathVariable("answerId") Long id)
	{
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
