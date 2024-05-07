package com.kh.practice.chap02.run;
// import = 가져오겠다 ↓ 위치에서      . 폴더 안 파일 명;
import com.kh.practice.chap02.loop.LoopPractice;

public class Run {
	// 최종으로 실행하는 메인 메서드 
	public static void main(String[] args) {
		// 기능 제공 클래스에서 최종으로 실행할 메소드 이름만 작성
		// 특정 기능을 실행할 수 있도록 기능을 작성한 공간
		
		// LoopPractice 에 있는 Greeting 을 가져와서 출력하고 싶음
		// Scanner 를 사용했던 것 처럼 
		// LoopPractice 를 new 로 가지고 와서
		// LoopPractice 밑에 있는 Greeting 을 소환할 것
		
		LoopPractice LP = new LoopPractice();
		//LP.Greeting();
		//LP.Greeting2();
		//LP.practice2();
		//LP.practice3();
		LP.practice15();
	
	}
}
