package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {

// ***public : 어디서든 접근 가능한 (전체 공개)
// protected : 같은 폴더 안에서만 접근 가능
// default : 같은 폴더 안에서 접근이 가능하지만 protected 보다 제한되게 접근 가능
// **private : 한 class 안에서만 접근 가능하고 작성한 공간 안에서만 접근 가능
// --------------------------------------------------------------------
// void : 반환하는 것 없이 바로 출력이 될 때 사용	
	public static void method1() {
		/*
		while 문을 사용해서 4번을 누르면 프로그램을 종료하는 코드 작성
		*/
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하는 프로그램을 번호로 고르세요.");
			System.out.println("1. 게임  2. 수영  3. 잠자기  4. 프로그램 종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("게임을 고르셨습니다.");
				break;
			case 2:
				System.out.println("수영을 고르셨습니다.");
				break;
			case 3:
				System.out.println("잠자기를 고르셨습니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료하셨습니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			
			}
		}
	}
	
	public static void kh카페() {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("kh카페에 오신걸 환영합니다. ^^7  \n "
					+ "원하는 메뉴를 입력해주세요. \n "
					+ "1 아메리카노   2 카페라테   3 녹차   4 흑당버블티   5 주문취소");
			String menu = sc.next();
			
			switch(menu) {
			case "아메리카노": case "1":
				System.out.println("아메리카노 주문 추가되었습니다.");
				break;
			case "카페라테": case "2":
				System.out.println("카페라테 주문 추가되었습니다.");
				break;
			case "녹차": case "3":
				System.out.println("녹차 주문 추가되었습니다.");
				break;
			case "흑당버블티": case "4":
				System.out.println("흑당버블티 주문 추가되었습니다.");
				break;
			case "주문취소": case "5":
				System.out.println("주문이 취소되었습니다. 다음에 방문해주세요.");
				return;
			default:
				System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
				
			}
		}
	}

	public static void getMoney() {
		// 커피값 10잔 커피 값 300원
		
		int coffee = 10;
		int money = 300;
		
		// 만약에 돈이 0보다 더 많다면 커피를 구매하고 
		// 커피가 다 소진되면 판매를 중지
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			// 커피가 10잔인데 1잔 제공했다면 -1
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee +" 잔 입니다.");
			// 커피가 모두 소진됐다면 판매를 중지
			if(coffee == 0) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				return;
			}
		}
	}
	
	public static void allNumber() {
		// 1부터 5까지 숫자를 출력
		int num = 1;
		
		while(num <= 5) {
			System.out.println(num);
			num++; // num + 1 
		}
	}
	
	public static void tree() {
		// 10번 찍어서 안넘어가는 나무 없다
		// 나무를 10번 찍으면 나무 넘기기
		// 나무를 찍기 전 이기 때문에 공격 0
		
		int attack = 0;
		
		while(attack < 10) {
			// 나무를 몇번 찍었는지 확인
			attack++;
			System.out.println("나무를 " + attack + " 번 찍었습니다.");
			// 만약에 나무를 공격한 수가 10번이 되면 나무 넘어갑니다 표현
			if(attack == 10) {
				System.out.println("나무가 쓰러집니다. 성공 ~!");
			}
		}
	}
	
	public static void method2() {
		// 사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 숫자를 모두 출력
		// 단 입력한 수를 1보다 크거나 같아야함
		// 만약 1 미만의 숫자가 입력됐다면 1 이상의 숫자를 입력해주세요 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
	
		if(num < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
		}
		else {
			System.out.println("1부터 " + num + "까지의 숫자들");
			int abc = 1;
			// while 문을 사용하여 숫자 abc 부터 num 까지 모두 출력하기
			while(abc <= num) {
				System.out.println(abc);
				abc++;
			}
		}
	}

	public static void getCoffee() {
		// 커피가 100원, 돈이 없으면 커피를 구매하지 못하는 경우
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("카페에 오신걸 환영합니다.");
		System.out.print("현재 소유하고 있는 돈을 적으세요 : ");
		
		// 커피가격 coffeePrice
		int coffeePrice = 100;
		
		int money = sc.nextInt();

		// 만약에 
		while(money < coffeePrice) {
			System.out.println("돈이 부족합니다. 커피를 구매하기 위해 더 많은 돈을 넣어주세요.");
			System.out.print("현재 가진 돈을 입력해주세요.");
			money = sc.nextInt();
			}
				System.out.println("커피를 구매했습니다. 거스름 돈은 " + (money - coffeePrice) +
						"입니다.");
		}
		
	public static void iLovePork() {
		// 10000원 이상 돈이 없을 경우 탕수육을 시키지 못하는 예제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 보유하고 있는 금액 입력하기 : ");
		int money = sc.nextInt();
		
		int tangsuyuk = 10000;
		
		while(money < tangsuyuk) {
			System.out.print("보유하고 있는 금액이 부족합니다. \n"
					+ "다시 입급해주세요 :");
			money = sc.nextInt();
		}
		System.out.println("주문이 완료되었습니다. 거스름돈은 " + (money - tangsuyuk) + 
				" 입니다.");
	}
	
	public static void main(String[] args) {
		//method1();
		//kh카페();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		iLovePork();
	}

}
