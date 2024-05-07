package com.kh.inheritance.OverrideEX;
/* (ㅂ 한자)
동물
  └ 강아지
  └ 고양이 
 */




public class 실행 {

	public static void main(String[] args) {			
		
		강아지 강아지1번 = new 강아지("멍멍이");
		
		강아지1번.소리();
	
		고양이 고양이1번 = new 고양이("고영희");
		
		고양이1번.소리();
		
		// 소 만들어보기 (음메), 토끼 만들어보기 (낑낑)
		
		소 소1번 = new 소("소");
		
		소1번.소리();
		
		토끼 토끼1번 = new 토끼("버니");
		
		토끼1번.소리();
		
	}

}
