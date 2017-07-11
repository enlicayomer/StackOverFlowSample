package com.eteration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.entity.Question;
import com.eteration.repository.QuestionRepository;

@RestController
@RequestMapping("q")
public class QuestionController {

	@Autowired
	private QuestionRepository questionRepository;
	
	@GetMapping("all")
	public List<Question> getAllQuestion()
	{
		return questionRepository.findAll();
	}
	
	@PostMapping("add")
	public Question addQuesetion(@RequestBody Question question)
	{
		return questionRepository.save(new Question(question.getHeader(),question.getBody(),question.getDate(),question.getAuthor(),question.getCategory()));
	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	ResponseEntity<?> add(@PathVariable Long questionId, @RequestBody Question question) {
//
//		questionRepository.findByQuestion(questionId).
//		return this.questionRepository
//				.findByQuestion(questionId)
//				.map(account -> {
//					Bookmark result = bookmarkRepository.save(new Bookmark(account,
//							input.uri, input.description));
//
//					URI location = ServletUriComponentsBuilder
//						.fromCurrentRequest().path("/{id}")
//						.buildAndExpand(result.getId()).toUri();
//
//					return ResponseEntity.created(location).build();
//				})
//				.orElse(ResponseEntity.noContent().build());
//
//	}
}
