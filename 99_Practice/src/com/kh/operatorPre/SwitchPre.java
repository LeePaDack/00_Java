package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {

	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int day = sc.nextInt(); // 키보드로 받은 숫자 입력
		
		switch (day) {
		case 1:
			System.out.println("월요일 입니다.");
			break;
		case 2:
			System.out.println("화요일 입니다.");
			break;
		default : 
			System.out.println("아무 요일도 아닙니다.");
		}
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 숫자로 입력하세요 : ");
		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("아메리카노 나왔습니다.");
			break;
		case 2:
			System.out.println("카페라떼 나왔습니다.");
			break;
		case 3:
			System.out.println("흑당버블티 나왔습니다.");
			break;
		default : 
			System.out.println("잘못 입력했습니다. 다시 이용해주세요.");
		}
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도시를 입력하세요 : ");
		String city = sc.nextLine();
		
		switch (city) {
		case "서울" : // 변수가 String 이면 case 에도 " " 를 이용해 넣어야함
			System.out.println("대한민국");
			break;
		case "도쿄" :
			System.out.println("일본");
			break;
		case "베이징" :
			System.out.println("중국");
			break;
		default :
			System.out.println("해당하는 도시가 없습니다.");
		}
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요");
		int month = sc.nextInt();
		//봄 3 4 5 여름 6 7 8 가을 9 10 11 겨울 12 1 2
		switch (month) { // case 는 중복이 될 수 없음
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄 입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름 입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을 입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(month + "월은 겨울 입니다");
			break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public static void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D, E, F 중 하나의 등급을 입력하세요 : ");
		
		char grade = sc.next().charAt(0); // .charAt() (0) : 0번째 자리 단어를 가져온다
		
		switch (grade) {
		case 'A': case 'a':
			System.out.println("4.0");
			break;
		case 'B': case 'b':
			System.out.println("3.0");
			break;
		case 'C': case 'c':
			System.out.println("2.0");
			break;
		case 'D': case 'd':
			System.out.println("1.0");
			break;
		default :
			System.out.println("입력한 정보가 없습니다.");
			
		}
		
	}
	
	
	
	// 실습문제 3
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력해주세요 : ");
		int month = sc.nextInt();
		
		
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
	
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//practice3();
		method5();
	}

}
