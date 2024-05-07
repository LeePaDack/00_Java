package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		
		// substring 메서드를 사용해서 문자열의 Today 추출
		String 문제1 = "Today is a beautiful day.";
		String 추출 = 문제1.substring(0,5); // 0 ~ 4 추출
		System.out.println(추출);
		
		// toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging.";
		String 변환 = 문제2.toUpperCase();
		System.out.println(변환);
		
		// toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting.";
		String 소변환 = 문제3.toLowerCase();
		System.out.println(소변환);
		
		// split 사용해서 문자열을 " " 로 구분하기
		String 문제4 = "A good medicine tastes bitter.";
		String 구분[] = 문제4.split(" ");
		for(String 구분1 : 구분) {
			System.out.println(구분1);
		}
		
		// replace 사용해서 more 을 less 로 대체
		String 문제5 = "The more, the better.";
		String 대체 = 문제5.replace("more", "less");
		System.out.println(대체);
		
		// charAt 사용해서 6 번째 글자를 가져오기
		String 문제6 = "Walls have ears.";
		char 가져오기 = 문제6.charAt(6);
		System.out.println(가져오기);
		
		// substring 메서드를 사용해서 his 부터 끝까지 추출
		String 문제7 = "Every dog has his name.";
		String 추출1 = 문제7.substring(14); // 14 ~ 끝까지 추출
		System.out.println(추출1);
				
	}
	
}
