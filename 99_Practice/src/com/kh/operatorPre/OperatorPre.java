// 패키지 : 내가 만든 클래스가 들어 있는 폴더의 위치
package com.kh.operatorPre;

import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

// 클래스 : 실행하고자 하는 코드를 작성하는 공간
public class OperatorPre {
	// 기본 출력 메서드
	// 최종으로 출력하는 매서드가 아님. 상황에 따라 최종 메서드에서 호출해서 사용할 수 있는 메서드중 하나
	// static : 메모리에서 고정
	
	public static void practice1() { // 모든 사람이 사탕을 골고루 나눠 갖기
		// 스캐너를 이용해서 키보드로 입력 받은 내용을 컴퓨터에 출력
		// System.in : 키보드로 입력 받을 수 있게 해주는 출력 시스템
		// Scanner : 키보드로 입력 받은 내용을 컴퓨터로 출력 
		// import 단축키 : Ctrl + Shift + o 
		Scanner sc = new Scanner(System.in);
		// Scanner 를 불러온 다음에 바로 sc 로 Scanner 기능을 불러와도 되긴하지만
		// System.out.print 를 이용해서 어떤 행동을 진행하고 있는지
		// 확인하는 작업을 진행할 것
		// 인원 수 입력 받기
		System.out.print("인원수를 입력 : ");
		int people = sc.nextInt();
		
		// 사탕 개수 입력 받기
		System.out.println("사탕 개수를 입력 : ");
		int candies = sc.nextInt();
		
		// 1인당 나눠줄 사탕 개수 계산
		int getCandies = candies / people;
		
		// 나눠주고 남은 사탕 개수 계산
		int remain = candies % people;
		
		//result 출력
		System.out.println("참여 인원 : " + people);
		System.out.println("캔디 총 개수 : " + candies);
		System.out.println("동일하게 나눠가진 캔디 개수 : " + getCandies);
		System.out.println("남은 캔디 개수 : " + remain);
	}
	
	
	public static void practice2() { // 키보드로 정보 입력받기 + 남 여 확인
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 관리용");
		// 이름 학년 반 번호 성별 성적 받기
		System.out.print("이름을 입력 : ");
		String name = sc.next();
		System.out.print("학년을 입력 : ");
		int grade = sc.nextInt();
		System.out.print("반을 입력 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) 입력 : "); // String -> char
		// Scanner로 char 값을 입력받고자 할 경우에는
		// charAt 를 사용하여 문자열 위치를 읽어오는 작업을 진행해야함
		// 시스템으로 예를 들면
		// System - out - print()
		// charAt : Scanner  - next - charAt(숫자만 적음) 
		//                             내가 보고자하는 숫자 위치
		// EX) T A B L E  = 5글자  순서는 0 1 2 3 4 임 
		// IF) 맨 앞 글자를 원하면? Scanner.next.charAt(0); = T
		// EX) charAt(1) : A
		
		//String gender = sc.next(); 
		char gender = sc.next().charAt(0);
		// 0 인 이유는 뭘 쓰던간 맨 앞자리만 가져올 것이기 때문
		System.out.print("성적 입력 :"); // 소주점 둘째 자리까지만
		double score = sc.nextDouble();
		// 성별에 따라 출력 문자열 설정
		// 삼항 연산자 출력 문자열 설정
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("성별 : " + gender);
		//System.out.println("성적 : " + score);
		System.out.printf("성적 : %.2f" , score);
		// printf : 서식이 지정된 문자열을 출력할 때 사용 (*** printf에서는 + 가 아닌 , 쓴다 ***)
		// printf 로 %f 를 출력할 때는 소수점 자리를 지정해줘도 되고 
		// 지정해주지 않아도 됨  BUT 만약에 소수점 자리 위치를 지정해서 출력하길 원한다면
		// %.출력을 원하는 소수점 위치 자리 값f 
		// EX) 소수점 4번째 자리까지 출력을 원함 -> %.4f
		// EX) %d : 10진수정수                %f : 소수점 수          
		// EX) %s : 문자열 출력                %c : 문자 하나 출력
		// EX) %b : true 인지 false 인지      %x : 16진수 정수     %o : 8진수 정수 
	}
	
	
	
	public static void practice3() {
		//국수영 대한 정보를 키보드로 입력 후 합계와 평균을 구해라

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		// 입력 받은 점수로 합계 계산 
		// 점수총합 
		int total = korean + english + math;
		
		// 총 점수 나누기 3 을 해서 평균 점수 계산
		// 점수가 무조건 소수점 이외 정수만 나온다는 보장X 
		// 실수가 나온다는 가정으로 double
		double average = (double) total / 3.0;
		
		System.out.println("국어 점수 : " + korean);
		System.out.println("영어 점수 : " + english);
		System.out.println("수학 점수 : " + math);
		System.out.println("Total 점수 :" + total);
		System.out.println("평균 점수 : " + average);
		
	}
	
		// 2개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면
		// true 아니면 false 출력
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		// 첫 번째 수 입력 받기
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// == 같으면 true   != 다르면 true 
		// true false 표현할 때 그 값이 true false로 표현 받기 위해서는
		// boolean 을 사용해서 표현을 함
		// 거짓 참을 담는 변수 = true or false; 
		boolean result = num1 == num2;
		System.out.println("num1 과 num2 의 결과 : " + result);
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result = num1 != num2;
		System.out.println("num1 과 num2 의 결과 : " + result);
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 수를 입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3);
		// ||
		boolean isOR = (num1 == num2) || (num1 == num2); 
		/*boolean result1 = num1 == num2;
		boolean result2 = num2 == num3;
		boolean result3 = num3 == num1;
		boolean result = result1 && result2 && result3; */
		System.out.println("num1, num2, num3 의 결과 : " + result);
		System.out.println("isOR : " + isOR);
	}
	
	// 메인 메서드 : 최종으로 실행하는 매서드 ↓
	public static void main(String[] args) {
		// 작성해준 메서드 중에서 실행이나 출력하고자 하는 메서드 작성 ↓
		//practice1(); 
		//practice2();
		//practice3();
		//method4();
		//practice4();
		practice5();
	}

}
