package com.kh.practice.snack.model.vo;

public class Snack {

	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	private char check;
	
	public void setCheck(char check) {
		this.check = check;
	}
	public char getCheck() {
		return check;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}
	
	public Snack() {
		
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	/*
	public void information() {
		System.out.println("종류 : " + kind);
		System.out.println("이름 : " + name);
		System.out.println("맛 : " + flavor);
		System.out.println("개수 : " + numOf);
		System.out.println("가격 : " + price);
	} */
	
	// return : String 값을 전달
	public String information() {
		return ("종류 : " + kind + ", 이름 : " + name + ", 맛 : " + flavor 
				+ ", 개수 : " + numOf + ", 가격 : " + price);
	}
}
