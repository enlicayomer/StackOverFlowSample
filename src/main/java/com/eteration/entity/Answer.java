package com.eteration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answer {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="answer_id")
	private Long id;
	
	@Column(name="answer_body")
	private String body;
	
	@Column(name="answer_date")
	private String date;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User author;

	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;
	
	
	public Answer() {
		super();
	}

	public Answer(String body, String date, User author, Question question) {
		super();
		this.body = body;
		this.date = date;
		this.author = author;
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
}
