package com.eteration.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_mail")
	private String userMail;

	@Column(name = "user_password")
	private String password;

	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Question> questions=new ArrayList<Question>();
	
	@OneToMany(mappedBy="user" , cascade=CascadeType.ALL)
	private List<Answer> answers=new ArrayList<Answer>();
	
	
	
	
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public User() {
		super();
	}

	public User(String userName, String userMail, String password) {
		super();
		this.userName = userName;
		this.userMail = userMail;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
