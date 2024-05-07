package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {
	// 메인 메서드
	public static void main(String[] args) {
		
		Product pd = new Product();
		
		// 정보 저장 : 사과 사과가격 사과브랜드
		pd.setpName("사과");
		pd.setPrice(2000);
		pd.setBrand("유기농 마을");
		
		pd.information();
		
		System.out.println("==== get 불러오기 ====");
		System.out.println("이름 : " + pd.getpName());
		System.out.println("가격 : " + pd.getPrice());
		System.out.println("브랜드 : " + pd.getBrand());
	}

}
