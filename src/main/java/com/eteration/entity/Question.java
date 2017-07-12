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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	@OneToMany(mappedBy="question",cascade=CascadeType.ALL)
	private List<Answer> answers=new ArrayList<Answer>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	  @JoinTable(
	      name="Qst_Cat",
	      joinColumns=@JoinColumn(name="que_id", referencedColumnName="question_id"),
			inverseJoinColumns = @JoinColumn(name = "cat_id", referencedColumnName = "category_id"))
	private List<Category> category;

	
	
	public Question(String header, String body, String date, User user, List<Category> category) {
		super();
		this.header = header;
		this.body = body;
		this.date = date;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	


}
