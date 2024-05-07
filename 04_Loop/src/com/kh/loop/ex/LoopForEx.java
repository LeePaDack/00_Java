package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	// 기본 메서드
	
	// 출력방법 1. LoopforEx 에서 출력하길 원한다면
	// public static void guguDan 으로 static을 추가한 후
	// public static void main(String[] args){
	// guguDan();
	//}
	
	// 출력방법 2. static 을 붙히지 않고 출력하길 원한다면
	// 출력용 클래스를 만들어서 출력하기 LoopForRun
	// 종료를 하기 전까지 반복해서 출력
	public void guguDan() {
		// 사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입니다.");
		// 구구단을 0 을 입력하기 전까지 반복해서 출력하기
		// 반복하기 위해 while 문 사용
		while(true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 수를 입력해주세요 : ");
			int dan = sc.nextInt();
			// 만약 0 이 들어오면 프로그램 종료
			if(dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 받은 수를 for 문 이용해서 출력하기
			
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			
		}
	}
	
	public void guguDan2() {
		// 1. 스캐너로 구구단 값 입력받기
		// 2. int dan = sc.nextInt();
		// 3. for 문을 활용해서 9단 부터 1단까지 출력하기
		//	  for(int a = 1; ~~~~; a--) {
		// 			System.out.println("거꾸로 출력하기");
		//}
		// 4. 종료를 원할 경우 0 을 입력해주면 종료하기 while 문 추가하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료를 원하면 0 을 입력해주세요");
			System.out.print("원하는 수를 입력해주세요 : ");
			int dan = sc.nextInt();
			
			if(dan == 0) {
				System.out.println("프로그램이 종료됩니다.");
				break; // break 는 if 문에서 단독 사용 X 하지만 while 이 있으므로 가능
			}
			// continue 자주 사용 X 
			// if 1 ~ 9 까지만 입력 가능하도록 조건
			if (dan < 1 || dan > 9 ) {
				System.out.println("1 부터 9 까지의 숫자를 입력해주세요.");
				continue; // 건너뛰고 계속하기
			}
			for(int i = 9; i >= 1; i--) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}
	}
	
	public void guguDan3() {
		// 구구단을 1단부터 9단까지 모두 출력
		// int dan = 원하는 단만 지정해서 출력
		
		// 1단부터 9단까지 출력
		for(int dan = 1; dan <= 9; dan++) {
			// 1단에서 부터 1 ~ 9 를 곱해준 값을 출력 
			
			System.out.println("//////////[[" + dan + "]]//////////");
			
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
			}
		}
	}

	public void guguDan4() {
		// 구구단을 2단부터 9단까지 출력
	
		for(int dan = 2; dan <= 9; dan++) {
		
		System.out.println("/////////////" + dan + "///////////////");
		
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
			}
		}
	}
	
	public void randomNumber() {
		// 10 개의 숫자 랜덤으로 출력하기
		// Random 불러와 내가 지정한 범위에서 숫자를 랜듬으로 출력하기
		Random 랜덤 = new Random(); // 랜덤 불러오기
		
		// nextInt() 안에 숫자를 넣어서 어디서부터 어디사이에서 랜덤으로 숫자가 나와야하는지
		// 범위를 지정할 수 있음
		int 랜덤숫자 = 랜덤.nextInt(); // ()에 n을 넣으면 0 ~ n-1 사이에 숫자가 나옴 
		// 숫자를 셀 때 코드 안에서는 -1 ~ 정수 양수 0 부터 시작
		// 랜덤으로 지정한 숫자 -1 
		System.out.println("랜덤숫자 : " + 랜덤숫자);
	}
	
	public void randomFor() {
		// 랜덤으로 숫자 3개 출력하기	
		Random ran = new Random();
		
		// 랜덤 숫자 3개 출력 1 ~ 10 사이의 숫자
		
		for(int num = 1; num <= 3; num++) {
			// 랜덤으로 숫자를 만들어주기
			int randomNumber = ran.nextInt(10) +1; // 그냥 (10) 이면 0 ~ 9 지만
			// +1 을 해주면 10 + 1 
			System.out.println("랜덤숫자" + num + " : " + randomNumber);
		}
	}
	
	public void randomFor2() {
		// 랜덤으로 1 ~ 45 개의 번호 6자리 for 문을 이용해 출력
		Random ran = new Random();
		for(int num = 1; num <= 6; num++) {
			int randomNumber = ran.nextInt(45) + 1;
			// if 문을 사용해 랜덤 숫자가 같다면 번호를 제외하고 출력하기
			System.out.println("랜덤 로또 번호는 : " + randomNumber);
		}
	}
	
	public void oddNum() {
		// 1 부터 10 까지의 숫자 중에서 홀수만 출력하기
		for(int num = 1; num <= 10 ; num++) {
			// 만약에 숫자가 홀수라면 출력하기
			if(num % 2 != 0) {
				System.out.println(num);
			}
		}
	}
	
	public void evenNum() {
		// 짝수만 1 ~ 10 까지 출력하기
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void squareStar() {
		// 정사각형 모양의 별 출력
		int star = 3;
		for(int i = 0; i < star; i++) { // 한줄출력 0 1 2
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println(""); // 가로로 별을 출력한 다음 줄바꿈
		}
	}
	
	public void fiveStar() {
		// 정사각형 모양의 별 출력 가로로 5 개씩
		int star = 5;
		for(int i = 0; i < star; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public void numberGame() {
		// 숫자 맞추기 게임
		Scanner sc = new Scanner(System.in);
		// 랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추는 게임
		// 랜덤으로 숫자 만들기
		// 숫자를 맞출 때 까지 계속 문제를 맞추도록 만들기
		// for 문으로 기회 2번주기
		// if 문 수정 후 숫자 값에 대한 힌트주기
		Random random = new Random();
		
		while(true) {
			int randomNumber = random.nextInt(3) + 1; // 1 ~ 3
			System.out.println("숫자를 맞춰보세요! (1 ~ 3): ");
			for(int i = 2; i > 0; i--) {
				System.out.println("기회가 " + i + "번 남았습니다");
				int guest = sc.nextInt(); // 게스트가 입력한 숫자 가져오기
				
				if (guest == randomNumber) {
					System.out.println("축하합니다!! 정답입니다!!");
					break;
				}
				else if (guest < randomNumber) {
					System.out.println("숫자가 너무 작습니다");
				}
				else if (guest > randomNumber) {
					System.out.println("숫자가 너무 큽니다");
				}
			}
			System.out.println("게임을 다시 시작하시겠습니까? (1번 : OK / 2번 : NO)" );
			int playAgain = sc.nextInt();
			if (playAgain == 2) {
				System.out.println("게임이 종료 되었습니다.");
				break;
			}
		}
	}

	
	
	
}






