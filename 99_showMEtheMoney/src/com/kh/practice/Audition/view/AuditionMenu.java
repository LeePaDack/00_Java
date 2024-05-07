package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu {

	public AuditionController ac = new AuditionController();
	
	public AuditionMenu() {
		
	}
	
	// 출력하는 것을 만들어야함
	
	public void printAudition() {
		System.out.println("이름 분야 점수");
		System.out.println("//////////////////");
		
		for(Audition audition : ac.printAudition()) {
			System.out.println(audition.inform());
		}
		// 총점 평균 합격여부
		System.out.println("총점 : " + ac.sumScore()); //총점
		System.out.printf("평균 : %.3f \n" , ac.avgScore()[1]); // 평균
		System.out.println("합격여부 " + (ac.avgScore()[1] >= ac.CUT_LINE));
		
		
		
		ac.printPass();
	}
	
	
	
	
	
}
