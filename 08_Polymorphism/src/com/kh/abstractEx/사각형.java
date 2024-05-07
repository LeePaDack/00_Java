package com.kh.abstractEx;

public class 사각형 extends 도형 {
// 필드 
	private double 밑면;
	private double 높이;

// 메서드
	// 생성자 : 필수
	public 사각형(String 색깔, double 밑면, double 높이) {
		super(색깔);
		this.밑면 = 밑면;
		this.높이 = 높이;
	}

	@Override
	public double 도형넓이() {
		return 밑면 * 높이;
	}
	
	@Override
	public double 도형둘레() {
		return 2 * (밑면 + 높이);
	}
	
	
}
