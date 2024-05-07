package com.kh.practice.Audition.model.vo;

public class Audition {

	private String name;
	private String vlaue;
	private int score;
	private boolean passed;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setVlaue(String vlaue) {
		this.vlaue = vlaue;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	
	public String getName() {
		return name;
	}
	public String getVlaue() {
		return vlaue;
	}
	public int getScore() {
		return score;
	}
	public boolean isPassed() {
		return passed;
	}
	
	public Audition() {
		
	}
	
	public Audition(String name, String vlaue, int score) {
		this.name = name;
		this.vlaue = vlaue;
		this.score = score;
	}
	
	public String inform() {
		return "이름 : " + name + ", 분야 : " + vlaue + ", 점수 : " + score;
	}
	
	
	
	
	
	
	
}
