package com.kh.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// for 문을 활용한 배열 출력하기
		int numbers[] = new int[5];
		
		// 1 부터 4 까지 배열에 숫자를 넣기
		// index 가 0 부터 시작하기 때문에 i = 0
		// length 를 사용해서 최대 길이를 구할 수 있음
		// length : 길이
		
		System.out.println("최대길이 : " + numbers.length);
		
		for (int i = 0; i < numbers.length; i++ ) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] = " + i);
		}
	}

}
