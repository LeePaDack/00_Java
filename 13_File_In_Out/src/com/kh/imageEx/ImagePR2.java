package com.kh.imageEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePR2 {
	/*
	바탕화면에 이미지폴더 / 동물이름.txt 파일 생성후
	소 고양이 돼지 토끼 호랑이 이름을 \n 을 사용해 만들어주고
	동물이름을 만들어준 다음
	좋아하는 동물 이름으로 폴더 이름 변경한 다음
	삭제하기
	 */
	
	public static void main(String[] args) {
		// String 폴더경로 = System.getProperty("user.home") + /Desktop; 으로 하고
		//        폴더명을 작성할때마다 / 있는지 확인          ↓ 에 폴더경로 + "/이미지폴더" 해도 됨
		File makeDirectory = new File("c:/Users/user1/Desktop/이미지폴더");
		
		System.out.println("바탕화면에 이미지폴더가 있습니까?");
		if(makeDirectory.exists()) {
			System.out.println("이미 있습니다");
		}
		else {
			makeDirectory.mkdir();
			System.out.println("폴더 만들기 성공");
		}
		
		/*
		FileWriter ㅇㅇㅇ = new FileWriter(이미지폴더 + "/동물이름.txt");
		ㅇㅇㅇ.write("asdasdadsd"); 를 하면 생성과 작성을 한번에 할 수 있음
		try catch 사용. 
		 */
		
		
		//                                                                     , true : 이어작성하기
		File textDirectory = new File("c:/Users/user1/Desktop/이미지폴더/동물이름.txt");
		System.out.println("동물이름 텍스트파일이 있나요?");
		if(textDirectory.exists()) {
			System.out.println("이미 존재합니다.");
		}
		else {
			try {
				textDirectory.createNewFile();
				System.out.println("만들기 성공");
				
			} catch (IOException e) {
				System.out.println("생성실패");
				e.printStackTrace();
			}
		}
		
		
		// FileWriter 는 글쓰는건 편리하지만 파일의 이름을 비교하거나 다른작업은 하기 어려움
		FileWriter content;
		try {
			content = new FileWriter(textDirectory);
			content.write("소\n고양이\n돼지\n토끼\n호랑이");
			content.close();
			System.out.println("글쓰기 성공");
			
			// 동물이름.txt 좋아하는동물이름.txt 로 파일명 변경
			File changeDir = new File("c:/Users/user1/Desktop/이미지폴더/좋아하는동물이름.txt");
			if(textDirectory.renameTo(changeDir)) {
				System.out.println("파일 이름이 변경되었습니다.");
			}
			else {
				System.out.println("파일 이름 변경에 실패했습니다.");
			}
			
			// 삭제하기 
			// 폴더 삭제, 파일 삭제
			// 폴더 삭제를 할 때 폴더 안에 파일이 존재한다면 폴더 삭제가 되지 않음
			
			// 폴더 안에 파일이 존재하는지 확인하고 폴더 안에 파일이 없다면 삭제
			// 배열을 이용해서 파일 목록을 받고 파일 목록이 없다면 삭제
			
			File 파일목록[] = makeDirectory.listFiles();
			System.out.println("폴더안에 파일 목록보기 : " + textDirectory);
			
			// for each
			for(File f : 파일목록) {
				System.out.println(f.getName());
				textDirectory.delete();
				changeDir.delete();
				makeDirectory.delete();
			}
			
			
			
		} catch (IOException e) {
			System.out.println("글쓰기 실패");
			e.printStackTrace();
		}
		

		
	}
	
}
