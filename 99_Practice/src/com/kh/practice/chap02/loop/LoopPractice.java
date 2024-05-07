package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		// 사용자로부터 한 개의 값을 입력 받아 1 부터 그 숫자까지의 숫자들을 모두 출력
		// 단, 입력한 수는 1 보다 크거나 같아야하고 만일 1 미만의 숫자를 입력했다면 
		// 1 이상의 숫자를 입력해주세요 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력 받은 숫자가 1 미만일 경우 출력해주기
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		// 입력받은 숫자가 1 이상이면 1 부터 입력받은 숫자까지 모두 출력해주기
		for (int i = 1; i <= num; i++) {
			// System.out.println(i + " <= " + num);
			System.out.print(i + " ");
		}
		// 마무리로 줄바꿈을 해주길 원한다면 
		System.out.println(); // 줄바꿈 완성
	}
	
	public void practice2() {
		// 1 미만의 숫자가 입력됐다면 
		// 1 이상의 숫자를 입력 해주세요
		// 다시 사용자가 값을 입력하도록 하기
		
		int num;
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("수를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
			else {
				break;
			}
			// 1 부터 ~ 까지의 숫자들이 나왔는지 출력을 보고싶다면
		}
		System.out.println("1 부터 " + num + " 까지의 숫자들");
		int i = 1;
		while(i <= num) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println();
	}
	
	public void practice3() {
		// 사용자로부터 한 개의 값을 입력받아
		// 1 부터 그 숫자까지의 모든 숫자를 거꾸로 출력하기
		// 단 입력한 수는 1 보다 크거나 같아야 함
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("///////practice3///////");
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if (num < 1) {
				System.out.print("1 이상의 숫자를 다시 입력하세요 : ");
			}
			else {
				break;
			}
		}
		System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다.");
		while(num >= 1) {
			System.out.print(num + " ");
			num--; // 키보드로 입력받은 숫자에서 -1 을 하면서 1 이 될 때 까지 출력
		}
		System.out.println();
	}

	public void practice4() {
		// 1 미만의 숫자가 입력되면 1 이상의 숫자를 입력해주세요 출력되면서
		// 사용자가 값을 입력하도록 하기
		// 숫자를 입력받은 숫자부터 1까지 출력하기
		Scanner sc = new Scanner(System.in);
		
		// 잘라내기 컨 X    컨 V
		
		int num; // practice4 안에서 어디에서든 num 을 알 수 있도록 바깥으로 호출해준 것
		// do - while : 조건이 참이 아니여도 무조건 최초 1회는 실행 
		do {
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			// 1 미만의 숫자가 들어오면 
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				// 조건에 관계 없이 do 로 인해 무조건 1회 실행되는 것이기 때문에 
				// return 이나 break 를 작성해주지 않아도 될 경우가 많음
			}
		}
		while (num > 1);
		
		// 만약에 1 보다 커서 밑으로 내려온다면
		// num 부터 1 까지 거꾸로 출력해주는 for 문을 작성해주기
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		// 입력 받은 수의 총 합이 들어갈 바구니
		int result = 0;
		
		// 숫자가 들어왔을 때 1 부터 입력받은 숫자까지 더해서 총합 구하기
		for (int i = 1; i <= num; i++) {
			result += i;
			
			// 더해지는 숫자 출력하기
			if (i < num) {
				System.out.print(i + " +");
			}
			else { // i > num
				System.out.print(i + " =");
			}
		}
		System.out.print(result);
	}

	public void practice7() {
		/*
		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자 출력하기
		만일 1 미만의 숫자가 입력됐다면 1 이상의 숫자를 입력해주세요 출력하기
		(6과7의 다른점) 다시 사용자가 값을 입력해서 출력하기 추가
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 수를 입력해주세요 :");
			int firstNum = sc.nextInt();
			System.out.print("두 번째 수를 입력해주세요 : ");
			int secondNum = sc.nextInt();

			// 만약에 첫 번째 숫자와 두 번째 숫자 모두 1 보다 크거나 같을 경우
			if (firstNum >= 1 && secondNum >= 1) {
				for (int i = firstNum; i <= secondNum; i++) {
					System.out.print(i + " ");
				}
				break;
			}
			else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		// math.min math.max 로 줄일 수 있음 
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		// 두 정수와 연산 기호를 받아서 계산하는 메소드 
		// 연산의 경우에는 + / * - %
		String operator; // char operator charAt
		
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할 것");
			System.out.print("연산 입력(+ - * / %) : ");

			operator = sc.next();
			
			// 만약에 exit 를 입력해서 프로그램 종료를 원할 경우
			// 문자열(String) 으로 비교를 할 경우 equals == 
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// 정수 1 과 정수 2 를 입력 받아서 계산
			System.out.print("정수1 : ");
			int 정수1 = sc.nextInt();
			System.out.print("정수2 : ");
			int 정수2 = sc.nextInt();
			
			// 정수1 과 정수2 계산에 대한 결과(=result)
			int 결과;
			
			// switch case "+"
			if(operator.equals("+")) {
				결과 = 정수1 + 정수2;
			}
			else if(operator.equals("-")) {
				결과 = 정수1 - 정수2;
			}
			else if(operator.equals("*")) {
				결과 = 정수1 * 정수2;
			}
			else if(operator.equals("/")) {
				// 몫 같은 경우에는 0으로 나눌 수 없음 즉 정수2 는 0이 될 수 없음
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				결과 = 정수1 / 정수2;
			}
			else if(operator.equals("%")) {
				if(정수2 ==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				결과 = 정수1 % 정수2;
				
			}
			else {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			System.out.println(정수1 + " " + operator + " " + 정수2 + " = "
					+ 결과);
		}
	}
	
	public void practice13() {
		// 이중 for 문 문제
		// 키보드로 숫자를 입력받고 별 찍기를 진행
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력받은 수 만큼 세로줄 출력 ex) 2 세로로 二 칸   ex) 3 세로로 三 칸
		for (int 세로줄 = 1; 세로줄 <= num; 세로줄++) {
			// 별을 한줄씩 만들어주고 싶음
			// 한 줄 - 하나   두 줄 - 둘   세 줄 = 셋 ...  num 줄 = num
			for (int 별 = 1; 별 <= 세로줄; 별++) {
				System.out.print("*");
			}
			// 줄바꿈을 해줄 엔터가 없으면 가로로 모두 출력
			System.out.println(); // 을 해줘야 제대로 출력이 됨
		}
	}

	public void practice14() {
		/*
		정수를 입력해서 첫 번째 줄에서 가장 많은 별을 출력
		13 과는 반대로 나오게 하면 됨 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 이중 for 문 for (int line = num; 조건식; 증감식) {
		//				 for(int star = 1; line <= star; star++) {
		//					 System.out.print("*");
		//				}
		//              System.out.println();
		//            }
		for (int line = 1; line <= num; line++) {
			for (int star = num; star >= line; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice15() {
		/*
		****
		 ***
		  **
		   *
		   모양 만들기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		// 키보드로 입력 받은 수를 size 안에 넣어줌
		int size = sc.nextInt();
		// line 은 세로로 된 줄의 번호를 나타냄
		for (int line = 0; line < size; line++) {
			// blank 는 공뱅을 출력하기 위한 for 문
			// line 번째 줄에서는 line 개의 공백을 출력
			// 첫 번째 줄 size
			// 두 번째 줄 size - line ...
			for (int blank = 0; blank < line; blank++) {
				System.out.print("  ");
			}
			for (int star = size; star > line; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void Greeting() {
		System.out.println("안녕하세용.");
	}
	
	public void Greeting2() {
		System.out.println("반갑습니다.");
	}
}
