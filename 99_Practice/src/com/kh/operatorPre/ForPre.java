package com.kh.operatorPre;

import java.util.Scanner;

public class ForPre {

	public static void practice8() {
		int dan = 4;
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("프로그램을 종료하고 싶으면 0 을 누르세요");
			System.out.print("수를 적으세요 : ");
			int dan = sc.nextInt();
			
			if(dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
			else if(dan >= 1 && dan <= 9) {
				System.out.println("===== " + dan + "단 =====");
				for(int i = 1; i <= 9; i++) {
					System.out.println(dan + " * " + i + " = " + (dan * i));
				}
			}
			else if(dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("1 이상의 	수를 입력해주세요.");
			}
		}		
	}
	
	
	public static void main(String[] args) {
		//practice8();
		practice10();
	}

}
