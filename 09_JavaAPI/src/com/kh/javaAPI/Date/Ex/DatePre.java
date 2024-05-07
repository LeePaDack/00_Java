package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜 만들기

		// 1. yyyy-MM-dd
		SimpleDateFormat 날짜 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시 = 날짜.format(new Date());
		System.out.println(날짜표시);
		
		// 2. HH:mm:ss
		SimpleDateFormat 시간 = new SimpleDateFormat("HH:mm:ss");
		String 시간표시 = 시간.format(new Date());
		System.out.println(시간표시);
		
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜시간 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 날짜시간표시 = 날짜시간.format(new Date());
		System.out.println(날짜시간표시);
		
		// 4. E 를 사용해서 요일 나타내기
		SimpleDateFormat 요일 = new SimpleDateFormat("E"); // O요일을 원하면 EEEE
		Date date4 = new Date();
		String 글자로데이터변경4 = 요일.format(date4);
		System.out.println(글자로데이터변경4);
		
		/* 1번 ~ 3번까지 이런 방법으로 가능
		SimpleDateFormat 날짜 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String 글자로데이터변경 = 날짜1.format(date);
		System.out.println("현재날짜 : " + 글자로데이터변경	
		*/
	}

}
