package com.kh.oop.method.ex;

public class Person {
	
	// 필드 이름 나이
	private String name;
	private int age;
	
	// Person 을 담을 생성자
	
	public Person() {
		
	}
	
	// 필드 대신에 값을 저장하고 내보내는 setter getter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 메인 메서드 만들어주기 
	// 단축키 main   Control + SpaceBar
	public static void main(String[] args) {
		Person person1 = new Person();
		
		// setter 를 활용해서 속성 값 설정 
		person1.setName("홍길동");
		person1.setAge(20);
		
		// getter 를 활용해서 속성 값 읽기
		System.out.println("이름 : " + person1.getName());
		System.out.println("나이 : " + person1.getAge());
	}
	
}
