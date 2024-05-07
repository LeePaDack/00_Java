package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.author = "qwerasdf";
		book1.price = 45000;
		book1.publisher = "출판사Y";
		book1.inform();
		
		Book book2 = new Book("책제목1", "출판사A", "작가B");
		book2.inform();
		
		Book book3 = new Book("책제목G", "출판사H", "작가AP", 10000, 9.0);
		book3.inform();
		
	}

}
