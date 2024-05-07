package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {

	private int lotto;


	public Lotto() {
		
	}

	public int getLotto() {
		return lotto;
	}

	public void setLotto(int lotto) {
		this.lotto = lotto;
	}
	
	public void information() {
		Random ran = new Random();
		for(int num = 1; num <= 6; num++) {
			int randomNumber = ran.nextInt(45) + 1;
			// if 문을 사용해 랜덤 숫자가 같다면 번호를 제외하고 출력하기
			System.out.println("랜덤 로또 번호는 : " + randomNumber);
		}
	}
	
}
