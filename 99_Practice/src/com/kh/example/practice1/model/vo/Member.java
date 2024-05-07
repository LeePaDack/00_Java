package com.kh.example.practice1.model.vo;

public class Member {

	// 필드
	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	// 생성자 메서드
	public Member() {
		
	}
	
	// 출력 메서드 (void : 출력(무언가를 실행)한다)
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("변경된이름 : " + memberName);
	}

	// 값을 받아서 전달하는 메서드 
	public String changeEmail(String reEmail){
		this.email = reEmail;
			return email;
	}
	
	public void printName() {
		System.out.println("변경된이름 : " + memberName);
	}
	
}
