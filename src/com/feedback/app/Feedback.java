package com.feedback.app;

public class Feedback {
	
	private int id;
	private String question;
	private int rating;

	public Feedback() {

	}

	public Feedback(int id, String question, int rating) {
		super();
		this.id = id;
		this.question = question;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", question=" + question + ", rating=" + rating + "]";
	}
	
	

}
