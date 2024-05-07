package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	// method1
	public static void method1() {
		// 숫자 값 2개를 받아서 숫자 두개가 일치하는지확인
		// 스캐너 이용, num1 num2 이 같으면 같습니다 출력 아니면 같지않습니다 출력 if문 활용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 값 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 값 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("같습니다.");
		}
		else {
			System.out.println("다릅니다.");
		}
		System.out.println("/////////////////");
	}
	
	// method2
	public static void method2() {
		// 문자 값 2개를 받아서 두개가 일치하는지 확인
		// 스캐너 이용, str1 str2 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("str1 값 입력 : ");
		String str1 = sc.nextLine();
		System.out.print("str2 값 입력 : ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("같습니다.");
		}
		else {
			System.out.println("다릅니다.");
		}
		System.out.println("/////////////////");
	}
	
	public static void method3() {
		// 실수 값 2개를 받아서 두개가 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("rNum1 값 입력 : ");
		double rNum1 = sc.nextDouble();
		System.out.print("rNum2 값 입력 : ");
		double rNum2 = sc.nextDouble();
		
		if(rNum1 == rNum2) {
			System.out.println("같습니다.");
		}
		else {
			System.out.println("다릅니다.");
		}
	}
	
	
	// 최종으로 실행할 메인 메서드 
	public static void main(String[] args) {

		method1();
		method2();
		method3();
	}

}
