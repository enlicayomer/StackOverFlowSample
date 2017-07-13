//package com.eteration.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.eteration.entity.Category;
//import com.eteration.repository.CategoryRepository;
//
//@RestController
//@RequestMapping("c")
//public class CategoryController {
//
//	@Autowired
//	private CategoryRepository categoryRepository;
//
//	@PostMapping("add/{name}")
//	public ResponseEntity<Void> addCategory(@PathVariable("name") String name)
//	{
//		categoryRepository.save(new Category(name));
//		return new ResponseEntity<Void>(HttpStatus.CREATED);
//	}
//}
