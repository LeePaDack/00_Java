package com.kh.conditionEx;

import java.util.Scanner;

// 패키지 : 작성한 파일의 폴더 위치
// 조건문 기능용 클래스
public class ConditionEx {
	/*
	if 와 else class
	
	if 주어진 조건이 참일 때 실행되는 코드 블록 
	else 조건이 거짓일 때 실행되는 코드 블록 (필수 X)
	
	사용방법
	if(조건문){
		조건이 참일 경우 실행할 코드
		만약에 조건문의 조건이 참이 아닐경우 자동으로 실행 종료
	}
	
	
	
	if - else if - else 
	
	
	
	*/
	
	// 메서드 1 : 19세 이상은 성인입니다 출력
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("성인이 아닙니다.");
		}
	}
	
	public static void method2() {
		int num = 2;
		
		// 만약에 num 이 짝수일 경우 짝수입니다. 출력
		// num 이 홀수일 경우 홀수입니다. 출력
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
	
	public static void method3() {
		// 0 ~ 13 어린이 , 14 ~ 어린이가 아닙니다.  
		// 1. 범위 
			// 0 보다 커야함
			// 14 보다 작아야함
		// 만약 이 학생의 나이가 0 ~ 14 일 때 어린이라고 표기
		// 14 부터는 어린이가 아닙니다. 표기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age > 0 && age < 14) {
			System.out.println("어린이 입니다.");
		}
		else {
			System.out.println("어린이가 아닙니다.");
		}

	}

	// public static void practice1()
	// 나이가 10세 이상 20세 미만 - 10대
	// 이 외는 10대가 아님을 스캐너를 활용해서 출력
	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. : ");
		int age = sc.nextInt();
		
		if(age >= 10 && age < 20) {
			System.out.println("10대 입니다.");
		}
		else {
			System.out.println("10대가 아닙니다.");
		}
	}
	
	
	// public static void practice2()
	// 나이가 80세 이상이면 80세 이상입니다. 출력
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. : ");
		int age = sc.nextInt();
		
		if(age >= 80) {
			System.out.println("80세 이상입니다.");
		}
		else {
			System.out.println("80세 미만입니다.");
		}
	}
	
	
	// 최종 메서드
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		practice1();
		practice2();
		
	}

}
