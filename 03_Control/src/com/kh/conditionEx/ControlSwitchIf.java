package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	
	public static void takeAtaxi() {
		// 입력 받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼 것
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		// if 문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드 작성
		if(money >= 3000) {
			System.out.println("택시를 탈까요? (예/아니오)");
			String answer = sc.next();
			
			// answer 로 받은 대답에 따라 응답을 처리하기
			switch (answer) {
			case "예" :
				System.out.println("택시를 탔습니다.");
				break;
			case "아니오" :
				System.out.println("택시를 타지 않습니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
		}
		
		
	}
	
	public static void whyScore() {
	/*
	사용자로부터 점수를 입력 받아 성적 등급을 판별하는 프로그램 작성
	90점 이상일 경우 A 
	80점 이상일 경우 B
	70점 이상일 경우 C
	60점 이상일 경우 D
	60점 미만일 경우 F  ->  F 학점일 때 재수강 하시겠습니까? (yes/no) 
	만약에 Yes No 이외의 값이 나올 수 있기 때문에 
	case YES : case yes :
	*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100) { //100점이 상한이라고 가정했을 때 0 ~ 100
			System.out.println("A 입니다.");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("B 입니다.");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("C 입니다.");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("D 입니다.");
		}
		else if(score < 60 && score >= 0) {
			System.out.println("F 입니다.");
			System.out.println("재수강 하시겠습니까? (yes/no)");
			String answer = sc.next();
			
			switch(answer) {
			case "yes": case "YES":
				System.out.println("재수강 신청 되었습니다.");
				break;
			case "no": case "NO":
				System.out.println("재수강 신청이 되지않았습니다.");
				break;
			default:
				System.out.println("잘못된 대답입니다. 다시 시도해주세요.");
			}
		}
		else {
			System.out.println("잘못 입력하였는지 확인하세요.");
		}
	}
	
	public static void whatDay() {
		/* public static void whatDay
		 * 월 수 금 : 헬스
		 * 화 목 : 공부
		 * 토 일 : 주말인데 집에서 쉴 예정입니까? (예 / 아니오)
		 * 	만약에 집에서 쉴 예정이면 네 집에서 쉴 예정입니다.
		 * 		아니오 선택하면 어떤 활동을 할 예정인지 선택해주세요.
		 * 			활동 1. 등산 2. 독서 3. 수영 선택할 수 있게 만들어줌
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일을 적으세요 : ");
		char day = sc.next().charAt(0);
		
		switch(day) {
		case '월' : case '수' : case '금' :
			System.out.println("헬스");
			break;
		case '화' : case '목' :
			System.out.println("공부");
			break;
		case '토' : case '일' :
			System.out.println("주말인데 집에서 쉴 예정입니까? (예/아니오)");
			String answer = sc.next();
			switch(answer) {
			case "예":
				System.out.println("쉬세요.");
				break;
			case "아니오":
				System.out.println("어떤 활동을 할 예정인가요? (1. 등산 2. 독서 3. 수영)");
				String hobby = sc.next();
				switch (hobby) {
				case "1": case "등산":
					System.out.println("등산 좋습니다.");
					break;
				case "2": case "독서":
					System.out.println("독서 좋습니다.");
					break;
				case "3": case "수영":
					System.out.println("수영 좋습니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			}break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whatDay();
		
	}

}
