package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setGrade(3);
		std1.setClassroom(6);
		std1.setName("김철수");
		std1.setHeight(150.3);
		std1.setGender('M');
		
		std1.information();
		
	}

}
