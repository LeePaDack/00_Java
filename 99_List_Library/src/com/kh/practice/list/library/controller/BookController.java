package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();
	
	// 생성자 
	public BookController() {

	}
	
	// 책 추가하기
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	// 책 전체 보기
	public void selectList() {
		// 만약 책이 있다면 책 목록 보여주기
		// 책이 없다면 등록된 도서가 없습니다.
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		}
		else {
			// for each 문을 활용해서 전체보기
			for(Book b : list) {
				System.out.println(b);
			}
		}
	}
	
	// 책 검색
	public void searchBook(String keyword) {
		List<Book> searchList = new ArrayList<Book>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword) || b.getAuthor().contains(keyword))
				searchList.add(b);
		}
		if(searchList.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		}
		else {
			for(Book bb : searchList) {
				System.out.println(bb);
			}
		}
	}
	
	// 책 삭제
	public void deleteBook(String title, String author) {
		// true false 를 통해 삭제가 됐는지 안됐는지 확인할 수 있도록 함
		boolean removed = false; // boolean 은 fasle 값이 기본이기 때문에 removed = false;
		// 책 제목과 저자를 검색해서 삭제할 책 찾기
		// 전체 목록 for each 로  한번에 다 볼 것 
		for (Book bbb : list) {
			// 만약 내가 삭제하고자 하는 책 제목과 책 저자가 존재하다면 
			//       책제목 가져오기.비교하기
			if (bbb.getTitle().equals(title) && bbb.getAuthor().equals(author)) {
				list.remove(bbb);
				// 삭제가 됐으면 true
				removed = true;
				break;
			}
		}
		// 만약에 삭제가 됐다면 삭제됐다를 true false 이용해서 표시하기
		if (removed) {
			System.out.println("도서 삭제가 완료되었습니다.");
		}
		else {
			System.out.println("해당하는 도서를 찾을 수 없습니다.");
		}
	}
	
	// 책 오름차순 정렬
	public void ascBook() {
		// for while short 오름차순 정렬을 해주면 됨
		
		// sort 리스트  목록을 ()으로 정렬하다
		//                        정렬하는 기준         책에서    책제목
		//                                             :: 람다 표현식
		//                            :: => Book 파일의 getTitle 참조해서 사용하겠다
		//                          comparing : 비교하다
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}
	
}
