package com.kh.operatorPre;
/*
표기법
코드를 작성할 때 개발자 사이에 코드를 명확하게 보여주기 위해 작성하는 방법

스네이크 케이스 
변수명에 언더바가 들어있는 표현 방식을 뱀처럼 생겼다해서 붙여진 이름
EX) snake_case     gender_code

파스칼 케이스 
첫글자와 중간 글자들이 대문자로 사용하는 표현방식
EX) PascalCase    GenderCodezkapf 

카멜 케이스
중간 글자만 대문자로 시작해서 표현하는 방식
EX) camelCase     genderCode

케밥 표기법
중간에 대시로 구분해서 변수명을 작성해주는 표기 방법
EX) kebab-case     gender-code
*/
import java.util.Scanner;

public class SwitchIfPre {

	public static void practice8() {
		// 주민번호를 이용해서 남자인지 여자인지 구분해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 - 포함해서 적어주세요 : ");
		String idNumber = sc.next();
		
		// 년생몇월몇일 - 남(1,3) 여(2,4) 7번째 자리 숫자로 성별을 알 수 있음
		// 주민번호 뒷자리의 첫 번째 숫자를 가지고 옴
		char genderCode = idNumber.charAt(7); // - 포함해서 7자리가 되지만
		// 주민번호를 - 제외하고 주민번호 숫자만 입력한다면 6번째 자리에 있는 값을 가져와야 함
		String gender; // 나중에 여자인지 남자인지 확인해주는 결과를 보여주기
		// 만약에 1이나 3이 들어온다면 남자  만약에 2나 4가 들어온다면 여자
		if(genderCode == '1' || genderCode == '3') {
			gender = "남자";
		}
		else if (genderCode == '2' || genderCode == '4') {
			gender = "여자";
		}
		else {
			System.out.println("올바른 주민번호가 아닙니다.");
			return;
		}
		System.out.println("입력한 주민번호는 " + gender + "입니다.");
	}
	
	public static void castingPractice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		// 유니코드 출력
		// 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하기 위한 방식
		// 글자에 숫자를 붙여 컴퓨터가 읽을 수 있도록 해주는 방식
		int unicode = (int) inputChar;
		System.out.println("입력한 문자 " + inputChar + "의 유니코드는 " + unicode + " 입니다.");
	}

	public static void castingPractice3() {
		// 주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f; // 기본값이 double 이기 때문에 float으로 변경해주는 f 를 써줌
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2 몫이 2로 떨어진다면
		System.out.println((int)dNum); // 2 // double 실수로 되어있는 것을 정수로 변경
		// double 8byte > int 4byte  강제 형변환을 시켜줄 것 
		// (int) 변경하겠다는 표시를 작성후 시켜줄 것
		System.out.println((double)iNum2 * dNum); // 10.0
		// 작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 
		// (double) 이 필수가 아니긴 함
		System.out.println((double)iNum1); // 10.0
		System.out.println((double)iNum1 / iNum2); // 2.5
		System.out.println(dNum); // 2.5
		System.out.println((int)fNum); // 3
		System.out.println((int)(iNum1 / fNum)); // 3
		// int 와 float 는 같은 크기의 byte 이므로 정수인지 실수인지 표기
		// float 소수점 이하 6자리까지만 보여줌
		System.out.println((double)iNum2 / fNum); // 3.3333333
		System.out.println((double)iNum1 / fNum); // 3.333333333333335
		System.out.println(ch); // 'A' 
		System.out.println((int)ch); // 65
		System.out.println((int)ch + iNum1); // 75
		// 'A' 값이 (int)ch를 통해 65확인
		// 큰 byte 와 작은 byte 가 만나면 자동으로 큰 byte 가 잠겨잠
		System.out.println((char)(ch + iNum1)); // 'k'
	}
	
	public static void controlPractice1() {
		// 키보드로 입력받고 입력 수정 조회 삭제 종료 버튼 눌러서 실행하기
		Scanner sc = new Scanner(System.in);
		
		// 메뉴 출력
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		// 메뉴 번호 입력 받기
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		// 선택된 메누에 따라 동작 수행
		switch(menuNumber) {
		case 1:
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	public static void controlPractice10() {
		Scanner sc = new Scanner(System.in);
		// System.out.print 에서 출력할 내용이 길어져서
		// 줄 바꿈으로 글을 작성하고 싶다면 
		// \n 을 이용해서 줄바꿈해서 출력하겠다는 표시
		// \n = 세로로 줄바꿈해서 출력
		// \r = 키보드 입력하는 위치를 현재 줄의 맨 처음으로 이동
		// System.out.print();
		// + 는 ); 을 붙이지 않는 한 줄을 바꿔서 계속 이어서 작성할 수 있음
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P / F");
		System.out.println("실행할 기능을 선택하세요 : ");
		
		int menuNumber = sc.nextInt();
		switch (menuNumber) {
		case 1:
			System.out.println("메뉴 출력 기능입니다.");
			break;
		case 2:
			System.out.println("짝수 / 홀수 기능입니다.");
			break;
		case 3:
			System.out.println("합격 / 불합격 기능입니다.");
			break;
		case 4:
			System.out.println("계절 기능입니다.");
			break;
		case 5:
			System.out.println("로그인 기능입니다.");
			break;
		case 6:
			System.out.println("권한 확인 기능입니다.");
			break;
		case 7:
			System.out.println("BMI 기능입니다.");
			break;
		case 8:
			System.out.println("계산기 기능입니다.");
			break;
		case 9:
			System.out.println("P / F 기능입니다.");
			break;
		default:
			System.out.println("잘못된 번호입니다.");
		}
	}
	
	public static void controlPractice5() {
		Scanner sc = new Scanner(System.in);
		// 사용자가 지정한 아이디 비밀번호
		String userID ="myId";
		String userPW ="myPassword12";
		
		System.out.print("아이디를 입력하세요 : ");
		String inputID = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String inputPassword = sc.next();
		
		// 입력 받은 값이 저장된 아이디 비밀번호와 일치하는지 확인
		if(userID.equals(inputID) && userPW.equals(inputPassword)) {
			System.out.println("로그인 성공");
		}
		
		// ! 특정 조건을 부정하는데 사용
		// userID.equals(inputID) : inputID userID 가 일치하는지 확인,, 일치하면 참
		// !userID.equals(inputID) : 일치하지 않는지 확인 ,, 일치하지 않으면 참
		else if (userID.equals(inputID)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if (userPW.equals(inputPassword)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		else {
			System.out.println("잘못된 아이디 비밀번호 입니다.");
		}
	}
	
	public static void controlPractice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 등급을 적으세요 : ");
		String userRole = sc.next();
		
		switch (userRole) {
		case "관리자":
			System.out.println("회원 관리, \n"
					+ "게시글 관리, \n"
					+ "게시글 작성, \n"
					+ "댓글 작성, \n"
					+ "게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, \n"
					+ "게시글 조회, \n"
					+ "댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("잘못 입력된 등급입니다.");
		}
	}
	
	public static void controlPractice8() {
		/* 키보드로 두개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		연산 결과 출력
		(두 개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력했을 경우
		"잘못입력했습니다." 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int aNum = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int bNum = sc.nextInt();
		System.out.print("연산 기호를 입력하세요 : ");
		String mark = sc.next();
		int result; 
		// / % 0 으로 나눌 수 없기 때문에 if 문으로 값이 0이 될 경우를 처리해줘야함
		switch (mark) {
		case "+" :
			result = aNum + bNum;
			break;
		case "-" :
			result = aNum - bNum;
			break;
		case "*":
			result = aNum * bNum;
			break;
		case "/":
			if(bNum == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = (int) ((double) aNum / bNum);
			break;
		case "%":
			if(bNum == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = aNum % bNum;
			break;
		default:
			System.out.println("잘못입력했습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.println(aNum + " " + mark + " " + bNum + "=" + result);
	}

	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//controlPractice1();
		//controlPractice10();
		//controlPractice5();
		//controlPractice6();
		controlPractice8();
	}

}
