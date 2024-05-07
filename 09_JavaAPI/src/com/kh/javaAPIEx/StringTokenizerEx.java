package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
StringTokenizer
Token : 동전, 최소단위, 정보를 가진 물리적 가상적 물체
 */
public class StringTokenizerEx {
	
	public static void main(String[] args) {
		//                              소괄호 안에 ↓ ""로 무언가를 넣어줘야함 
		// 구분자를 넣지 않으면, 기본으로 띄어쓰기 기준으로 구분
		StringTokenizer 토큰 = new StringTokenizer("자바 는 즐 기워");
		// hasMoreTokens() : 만약에 토큰 글자안에 글자가 조금이라도 들어있다면 true
		while(토큰.hasMoreTokens()) {
			// nextToken() : 현재 토큰은 꺼냈고 다음 토큰 보여줄 준비
			System.out.println(토큰.nextToken());
			
		}
	// 구분자를 , 넣은 토크나이저를 볼 것
		//                                      오사포를 "," 기준으로 나눈다는 의미
		StringTokenizer 토큰2 = new StringTokenizer("오렌지, 사과,포도", ",");
		while(토큰2.hasMoreTokens()) {
			System.out.println(토큰2.nextToken());
		}
		
		
		
	}
	
	
}
