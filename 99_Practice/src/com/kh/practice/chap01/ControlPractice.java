package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	// 메서드
	public void parctice11() {
		// 정수를 이용해서 4자리 비밀번호를 만들려고 함
		// 4자리 정수를 입력받아 각 자리 수에 중복되는 값이 없을 경우 성공
		// 입력된 정수가 4자리인지 확인해보자
		// 중복 값이 있으면 중복 값 있음 표시
		// 자리수가 안맞으면 '자리 수 안 맞음' 출력
		// 단, 제일 맨 앞자리 수의 값은 1 ~ 9 사이의 정수
		// 자리값 -> int[] 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("비밀번호 입력(1000 ~ 9999) : ");
			int pw = sc.nextInt();
			if(pw < 1000 || pw > 9999) {
				System.out.println("4자리가 아닙니다.");
				System.out.println("자리수가 안 맞음");
				continue;
			}
			int[] digits = new int[4]; // 4자리만 허용
			digits[0] = pw / 1000; // 천의 자리
			digits[1] = (pw / 100) % 10; // 백의 자리
			digits[2] = (pw / 10) % 10; // 십의 자리
			digits[3] = pw % 10; // 일의 자리
			
			boolean isTrue = true;
			
			for(int i = 0; i < digits.length; i++) {
				for(int j = i + 1; j < digits.length; j++) {
					if(digits[i] == digits[j]) {
						isTrue = false;
						break;
					}
				}
				if(!isTrue) {
					break;
				}
			}
			// 중복 여부에 따른 메세지 출력
			if(!isTrue) {
				System.out.println("중복 값이 있음");
			}
			else {
				System.out.println("비밀번호 생성 성공");
				break; // 비밀번호를 최종으로 잘 만들어주면 모두 종료
			}
		}
	}
	
	
}
