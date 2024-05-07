package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	// 최종 출력해주는 메인 메서드
	public static void main(String[] args) {
		method1();
	}
	// 최종으로 출력하는 메서드는 아님
	// 단 내가 필요할 때 꺼내서 사용할 수 있는 메서드 
	// 메서드 : 특정 상태나 기능을 정리해놓은 집합
	// static : 고정된 이라는 뜻을 가지고 있음
	// static 이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	
	public static void method1(){	
	// 1. int num1 = 10      int num2 = 3
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		int num1 = 10;
		int num2 = 3;
		
		int sum = num1 + num2;
		int dif = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		System.out.println("더하기 : " + sum + ", 뺴기 : " + dif + ", 곱하기 : " + mul +
				", 나누기 : " + div);
		
		// 2. double num3 = 2.5     double num4 = 3.5
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		double num3 = 2.5;
		double num4 = 3.5;
		
		double sumD = num3 + num4;
		double difD = num3 - num4;
		double mulD = num3 * num4;
		double divD = num3 / num4;
		System.out.println("더하기 : " + sumD + ", 뺴기 : " + difD + ", 곱하기 : " + mulD +
				", 나누기 : " + divD);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a를 입력 : ");
		int a = sc.nextInt();
		System.out.print("b를 입력 : ");
		int b = sc.nextInt();
		
		int scSumI = a + b;
		int scDifI = a - b;
		int scMulI = a * b;
		int scDivI = a / b;
		
		System.out.println("더하기 : " + scSumI + ", 뺴기 : " + scDifI + ", 곱하기 : "
		+ scMulI +", 나누기 : " + scDivI);
		
		
		System.out.println("double a 를 입력 : ");
		double aD = sc.nextDouble();
		System.out.println("double b를 입력 : ");
		double bD = sc.nextDouble();
		
		double scSumD = aD + bD;
		double scDifD = aD - bD;
		double scMulD = aD * bD;
		double scDivD = aD / bD;
		
		System.out.println("더하기 : " + scSumD + ", 뺴기 : " + scDifD +
				", 곱하기 : " + scMulD +", 나누기 : " + scDivD);
		
		
		
		
		
		
		
		
		

	}

}
