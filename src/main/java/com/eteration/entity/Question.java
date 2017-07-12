package com.eteration.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="question")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="question_id")
	private Long id;
	
	@Column(name="question_header")
	private String header;

	@Column(name="question_body")
	private String body;

	@Column(name="question_date")
	private String date;

	@ManyToMany
	@JsonManagedReference	
	private List<User> users=new ArrayList<User>();

	@JsonIgnore
	@OneToMany(mappedBy="question",cascade=CascadeType.ALL)
	private List<Answer> answers=new ArrayList<Answer>();
	@JsonIgnore
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Category> category=new ArrayList<Category>();

	
	
	public Question(String header, String body, String date, List<User> users, List<Category> category) {
		super();
		this.header = header;
		this.body = body;
		this.date = date;
		this.users = users;
		this.category = category;
	}

	public Question() {
		super();
	}

	
	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<Answer> getAnswer() {
		return answers;
	}

	public void setAnswer(List<Answer> answer) {
		this.answers = answer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}




	


}
