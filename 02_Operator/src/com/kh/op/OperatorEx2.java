package com.kh.op;

import java.util.Scanner;

// class 바깥에는 package 와 import 만 작성할 수 있음
// 이 외 개발자가 실행하고자 하는 내용은 class 내부에 작성해줘야함
// 메서드 : 특정 상태나 기능을 정리해놓은 집합

public class OperatorEx2 {
	// 1. 메서드 : 스캐너를 사용하지 않는 메서드
	public static void 메서드1() {
		int num1 = 20;
		int num2 = 5;
		
		int 더하기 = num1 + num2; 
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		int 나누기 = num1 / num2;
		
		System.out.println("더하기 : " + 더하기);
		System.out.println("빼기 : " + 빼기);
		System.out.println("곱하기 : " + 곱하기);
		System.out.println("나누기 : " + 나누기);
	}
	
	public static void 메서드2() {
		double num3 = 1.4;
		double num4 = 2.5;
		
		// double 더하기 빼기 곱하기 나누기를 실행하자
		double sum = num3 + num4;
		double sub = num3 - num4;
		double mul = num3 * num4;
		double div = num3 / num4;
		
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	}
	
	// 메서드 3() -> Scanner 
	// 메서드 옆에 있는 () 나중에 어떤 값을 받을 때 사용
	// 값을 받을 일이 없으면 () 빈 공간으로 유지
	
	public static void 메서드3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num5 를 입력 : ");
		int num5 = sc.nextInt(); // 키보드로 작성한 숫자가 num5로 들어 올 수 있게 변수선언
		
		System.out.print("num6 를 입력 : ");
		int num6 = sc.nextInt(); // '' num6로 ''
		// 키보드로 전달 받은 숫자를 사칙연산 할 수 있음
		
		int sum1 = num5 + num6; 
		int sub1 = num5 - num6;
		int mul1 = num5 * num6;
		int div1 = num5 / num6;
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sub1 : " + sub1);
		System.out.println("mul1 : " + mul1);
		System.out.println("div1 : " + div1);
	}
	
	// 메서드 4를 만들어서 스캐너로 double로 사칙연산 출력하기
	// double num7 = sc.nextDouble(); 
	// double num8 = sc.nextDouble();
	// sum2 sub2 mul2 div2
	
	public static void 메서드4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 ↓");
		
		System.out.print("num7 입력 : ");
		double num7 = sc.nextDouble();
		
		System.out.print("num8 입력 : ");
		double num8 = sc.nextDouble();
		
		double sum2 = num7 + num8;
		double sub2 = num7 - num8;
		double mul2 = num7 * num8;
		double div2 = num7 / num8;
		
		System.out.println("sum2 : " + sum2 + ", sub2 : " + sub2 + " mul2 : " + 
		mul2 + " div2 : " + div2);
		}
	
	// 최종 제출 메인 메서드
	public static void main(String[] args) {
		// 앞으로 만든 메서드 중에서 
		// 출력하고 싶은 메서드만 잘성할 것
		
		// 만약에 메서드1() 안에 작성한 내용을 출력하고 싶다.
		// 메서드1(); 이라고 작성 후 출력하면 가능함
		//메서드1();
		//메서드2();
		//메서드3();
		메서드4();
	}
}
