package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int num[] = new int[10];
		
		System.out.println("최대길이 : " + num.length);
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
	}
	
	public void practice2() {
		
		int num[] = new int[10];
		
		/* for(int i = 0; i < num.length; i++){
			num[i] = num.length - 1;
			
			System.out.print(num[i] + " ");
			}
		 */
		
		for(int i = num.length - 1 ; i >= 0 && i < num.length ; i--) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int num = sc.nextInt();
		
		int array[] = new int[num];
		System.out.println();
		
		for(int i = 0; i < array.length; i++) { // array.length 대신 num 해도 가능
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
	}
	
	public void practice4() {
		String fruit[] = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
		/*fruit[0] = "사과";
		fruit[1] = "귤";
		fruit[2] = "포도";
		fruit[3] = "복숭아";
		fruit[4] = "참외";              는 힘들기 때문에 위 방법으로 하면 좋음
		
		System.out.println(fruit[1]); */
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 문자열을 적으세요 : ");
		String exm = sc.next();
		
		System.out.print("찾고자 하는 단어를 적으세요 : ");
		char word = sc.next().charAt(0);
		
		char question[] = new char[exm.length()];
		
		for (int i = 0; i < exm.length(); i++) {
			//exm[1] = question[i];
		}
		
		
	}
	
	public void practice6() {
		String week[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : (0 ~ 6)");
		int num = sc.nextInt();
		
		if(num >= 0 && num < 7) {
			System.out.println(week[num] + "요일");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 배열의 길이 : ");
		int hl = sc.nextInt();
		
		int id[] = new int[hl];
		// for 문으로 해야할 것 같음 ↓ 를
		for(int i = 0; i < id.length; i++) {
			System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			id[i] = sc.nextInt();
		}
		System.out.print("배열 : ");
        for (int num : id) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        int sum = 0;
        for(int num : id) {
        	sum += num;
        }
        System.out.println("총 합 : " + sum);
	}
	
	public void practice8W() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if(num >= 3 && num % 2 == 1) {
				int id[] = new int[num];
				int middle = num / 2;
				for (int i = 0; i<= middle; i++) {
					id[i] = i + 1;	
				}
				for (int i = 0; i >= -middle; i--) {
					id[i] = i + 1;
				}
				
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9_() {
		int num[] = new int[7];
		
		// num 의 최종 길이를 알기 위해서 num.length 를 사용
		// 랜덤으로 숫자 출력하기
		// 랜덤으로 숫자를 출력하는 방법
		// 1. Random 객체 사용
		// 2. Math.random() 메서드 사용 (Math : 객체, random() : 메서드)
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1); 
			// 45 는 0 ~ 44 까지 나옴 그러므로 + 1 해줌
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}

	public void method1() {
		// int String double char
		// 각각의 배열을 만들고 출력
		
		int num[] = new int[3]; // 각 10 20 30 넣고 출력
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		System.out.println(num[0] + "," + num[1] + "," + num[2]);
		
		System.out.println("/////////////////////");
		
		String str[] = {"월", "화", "수", "목", "금", "토", "일"}; // 바로 넣고 출력
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println(str[5]);
		System.out.println(str[6]);
		
		System.out.println("/////////////////////");
		
		double dbl[] = new double[3]; // index 2 까지 만들고 출력 (실수 자유)
		dbl[0] = 12.3;
		dbl[1] = 23.4;
		dbl[2] = 34.5;
		
		System.out.println(dbl[0]);
		System.out.println(dbl[1]);
		System.out.println(dbl[2]);
		
		System.out.println("/////////////////////");
		
		char chr[] = new char[3]; // 문자 'A' 'B' 'C' 넣어준 다음 각 자리 출력해보기
		chr[0] = 'A';
		chr[1] = 'B';
		chr[2] = 'C';
		// char chr[] = {'A', 'B', 'C'} 도 가능
		
		for (int i = 0; i < chr.length; i++) {
			System.out.println("chr[" + i + "] = " + chr[i]);
		}
		
	}
	
	public void practice9() {
		int array[] = new int[7];
		
		for (int i = 0; i < array.length; i++) {
			Random ran = new Random();
			for(int num = 1; num <= array.length; num++) {
				int randomNumber = ran.nextInt(45) + 1;
				// if 문을 사용해 랜덤 숫자가 같다면 번호를 제외하고 출력하기
				System.out.println("랜덤 번호는 : " + randomNumber);
			}
		}
	}

	public void practice17() {
		// 입력한 값이 배열에 있는지 검색
		// 있으면 치킨 배달가능 없으면 없는치킨입니다 출력
		Scanner sc = new Scanner(System.in);
		
		String chicken[] = {"양념", "후라이드", "간장"};
		
		System.out.print("원하는 치킨 이름을 입력하세요 : ");
		String menu = sc.next();
		
		// 배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		// for - each 문을 사용해서 치킨이 있는지 확인하는 작업 (ㅁㄹ)
		// 만약에 치킨이 존재한다면 found = true; break;
		for (String 치킨 : chicken) {
			// System.out.println(치킨);
			if(치킨.equals(menu)) {
				found = true;
				break;
			}
		}
		// 만약에 치킨이 존재한다면 배달가능 출력
		if(found) {
			System.out.println(menu + "치킨 배달가능");
		}		// 존재하지 않는다면 ㅇㅇ 치킨은 없는 메뉴입니다 출력
		else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}

		
		
		
		/* if(menu == chicken[0] || menu == chicken[1] || menu == chicken[2]) {
			System.out.println(menu + "치킨 배달가능");
		}
		else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
		*/
		
	}
	
	
	
	
}
