package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {
	/*
	if - else if - else 
	
	사용 방법
	if(조건문1) {
		조건이 참일 경우 실행할 코드
	}
	else if(조건문2) {
		조건1이 거짓이며,
		조건2가 참일 경우 실행할 코드
	}
	else{
		조건1 ,2가 거짓일 경우 실행할 코드
	}
	 */
	
	// 만약 돈이 2,000원 이상 있을 경우 택시를 탄다.
	// 만약 돈이 1,500 ~ 1,900 이하 있을 경우 대중교통을 이용한다.
	// 만약 돈이 없을 경우 걸어 간다.
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

	/*
	나이를 입력 받아 
	13세 이하면 "어린이"
	13세 초과 18세 이하 "청소년"
	18세 초과 "성인" 
    */	 
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		String result;
		System.out.print("티켓나라 입니다.");
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			result = "어린이";
		}
		else if (age > 13 && age <= 18) {
			result = "청소년";
		}
		else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	sc.close(); 
	}
	
	/*
	달을 입력 받아서 해당하는 게절 출력하기
	봄 : 3, 4, 5
	여름 : 6, 7, 8
	가을 : 9, 10, 11 
	겨울 : 12, 1, 2
	 */
	public static void method4() {
		// 13세 이하 어린이  14 ~ 18 청소년    19~ 성인
		int age = 15;
		// 변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력 
		String result;
		if(age <= 13) {
			result = "어린이";
		}
		else if (age >= 14 && age <= 18) {
			result = "청소년";
		}
		else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇월 인가요?");
		int month = sc.nextInt();
		
		/*if(month == 3 || month == 4 || month ==5) {
			System.out.println("봄입니다.");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.println("여름입니다.");
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.println("가을입니다.");
		}
		else if(month == 12 || month == 1 || month == 2) {
			System.out.println("겨울입니다.");
		}
		else {
			System.out.println("없는 달입니다.");
		} */
		
		String result;
		if(month >= 3 && month < 6) {
			result = "봄";
		}
		else if(month >= 6 && month < 9) {
			result = "여름";
		}
		else if(month >= 9 && month < 12) {
			result = "가을";
		}
		else if(month >= 1 && month < 3 || month == 12){
			result = "겨울";
		}
		else {
			result = "없는 달";
		}
		System.out.println(result + "입니다.");
		sc.close();
	}
	
	
	public static void method1() {
		int money = 1800; // 내가 현재 가지고 있는 돈
		
		String result;
		if(money >= 2000) {
			result = "택시를";
		}
		else if(money >= 1500 && money <= 1900) {
			result = "대중교통을";
		}
		else {
			result = "걸음을";
		}
		System.out.println(result + " 이용한다.");
	}

}
