package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {
	// 잘라내기 : ctrl + x 후 ctrl + v
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 적으세요 : ");
		int num = sc.nextInt();

		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수 입니다.");
			}
			else {
				System.out.println("홀수 입니다.");
			}
		}
		else {
			System.out.println("음수 입니다. 양수를 입력해주세요.");
		}
		sc.close();
	}
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 적으세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 적으세요 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 적으세요 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double average = (double) total / 3.0; // total 앞에 double 자동형변환 되지만
		// 반대의 경우에는 오류가 생길 수 있으므로 넣는 습관을 만들자 
		
		String result;
		
		if(korean >= 40 && english >= 40 && math >= 40
				&& average >= 60) {
			result = "축하합니다!! 합격";
			System.out.println("국어 : " + korean + ", 영어 : " + english 
					+ ", 수학 : " + math +", 합계 : " + total +
					", 평균 : " + average);
		}
		else {
			result = "불합격";
			System.out.println("국어 : " + korean + ", 영어 : " + english + 
					", 수학 : " + math);
		}
		System.out.println(result + "입니다.");
		sc.close();
	}
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력해주세요 : ");
		int month = sc.nextInt();
		
		// int daysMonth; // 해당하는 달의 일수
		// ↑ 쓰려면 switch 에 case : 후 daysMonth = 31; 이렇게 쓰면 됨
		
		/*switch (month) {
		
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			daysMonth = 31;
			break;
		case 4: case 6: case 9: case 11:
			daysMonth = 30;
			break;
		case 2: 
			daysMonth = 28;
			break;
		default :
			System.out.println(month + "월은 존재하지 않는 달입니다.");
			//daysMonth = 0;
			 return;
		}
	System.out.println(month + "월은" + daysMonth + "일까지 있습니다.");
		*/
		
		switch (month) {
		
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일 까지 있습니다."); // 1 3 5 7 8 10 12
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일 까지 있습니다."); // 4 6 9 11
			break;
		case 2: 
			System.out.println(month + "월은 28일 까지 있습니다."); // 2
			break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(M)를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(KG)를 입력하세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		String result;
		System.out.println("BMI 지수 : " + BMI);
		if(BMI < 18.5) {
			result = "저체중";
		}
		else if(BMI >= 18.5 && BMI < 23) {
			result = "정상체중";
		}
		else if(BMI >= 23 && BMI < 25) {
			result = "과체중";
		}
		else if(BMI >= 25 && BMI < 30) {
			result = "비만";
		}
		else {
			result = "고도비만";
		}
		System.out.println(result + "입니다.");
		
		sc.close();
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double assign = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		double attendPer = (double) attend / 20 * 100;
		
		double midScore = mid * 0.2;
		double finScore = fin * 0.3;
		double assignScore = assign * 0.3;
		double attendScore = attendPer * 0.2;
		double totalScore = midScore + finScore + assignScore + attendScore;
		
		if (totalScore >= 70 && attendPer <= 70) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		System.out.println("//////////결과//////////");
		System.out.println("중간고사 점수 (20점 만점) : " + midScore);
		System.out.println("기말고사 점수 (30점 만점) : " + finScore);
		System.out.println("과제 점수 (20점 만점) : " + assignScore);
		System.out.println("출석 점수 (30점 만점) : " + attendScore);
		System.out.println("토탈 점수 (100점 만점) : " + totalScore);
	
	}
	
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice3();
		//practice4();
		//practice5();
	}

}
