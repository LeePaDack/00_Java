
public class Variable {

	public static void main(String[] args) {
		// 1. 정수  2. 문자  3. 문자열  4. 실수  5. 참, 거짓(논리형)
		
		// 1. 정수 _ byte short int long
		// byte = 1byte 가장 작은 단위
		byte 바이트 = 1;
		System.out.println(바이트);
		System.out.println("바이트");
		
		byte bt = 2;
		System.out.println(bt);
		
		short 쇼트 = 3;
		System.out.println(쇼트);
		
		int 인트 = 1;
		System.out.println(인트);
		
		long 롱 = 5;
		System.out.println(롱);
		
		
		
		// byte 자료형 선언 선언이름 bte bte 안에다가 숫자 2넣고 출력하기
		byte bte = 2;
		System.out.println(bte);
		
		// short 자료형 선언 선언이름 shrt shrt 안에다가 숫자 2넣고 출력하기
		short shrt = 2;
		System.out.println(shrt);
		
		// int 자료형 선언 선언이름 nt nt 안에다가 숫자 2넣고 출력하기
		int nt = 2;
		System.out.println(nt);
		
		// long 자료형 선언 선언이름 lng lng 안에다가 숫자 2넣고 출력하기
		long lng = 2;
		System.out.println(lng);
		
		
		
		// 2. 문자
		// 문자에는 char와 String이 있음
		// 문자를 나타내는 char은 작은 따옴표를 사용해야만 함 ''
		// "" 큰 따옴표는 String 문자열을 나타내는 표현임
		char myChar = 'A';
		System.out.println(myChar);
		
		/* char myChar2 = "A";  -----오류남 
		System.out.println(myChar2); */
		
		
		// char 에는 하나의 문자만 담을 수 있기 때문에 A 혹은 B만 작성 가능함
		/* char myChar3 = 'AB'; ------오류남
		System.out.println(myChar3); */
		
		
		/*
		 * char myChar3 = 'AB'
		 * char myChar4 = 'ABC'
		 * char myChar5 = '가나다'
		 * 모두 문자가 하나가 아니기 때문에 출력 할 수 없는 예시
		 * */
	
		
		// String
		String str1 = "안녕하세요.";
		System.out.println(str1);
		
		// String을 사용해서 본인의 이름 출력하기
		String name = "이계준";
		System.out.print("당신의 이름은 ");
		System.out.println(name);
		System.out.println("입니다.");
		// 만약에 여러 글자나 내용을 한줄로 출력하고 싶다면 
		// +를 사용해서 붙일 수 있음
		System.out.println("당신의 이름은 " + name + " 입니다.");
		// 띄어쓰기를 하면 됨 원하면 (큰 따옴표 안에)
		
		// 정수 + 문자 + 문자열 출력하기
		/*
		 * 안녕하세요. 저는요. 서울에 사는 ㅇㅇㅇ입니다.
		 * 제 전화번호는 111-2222-3333 입니다.
		 * 제 주민번호는 비밀입니다.
		 * 제 혈액형은 B입니다. */
		
		String greeting = "안녕하세요. ";
		String introduction = "저는요 서울에 사는 ㅇㅇㅇ입니다.";
		String number = "111 - 2222 - 3333";
		// char dash = '-';
		String secret = "비밀";
		String bloodType = "B형";
		
		System.out.print(greeting);
		System.out.println(introduction);
		System.out.print("제 전화번호는 ");
		System.out.print(number);
		System.out.println("입니다.");
		System.out.println("제 주민번호는 " + secret + "입니다.");
		System.out.println("제 혈액형은 " + bloodType + "입니다.");
		
		
		// 4. 실수
		// 실수는 float, double 이 존재
		
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		// 실수는 기본으로 double 형식으로 되어있음
		// float = 4byte , double = 8byte 
		// float에 실수를 담기 위해서는 f를 붙여줘야함 
		// 실수 뒤에 f를 붙일 때 대,소문자 구분 없이 사용 가능 3.14f 와 3.14F 둘다 문제 없음
		System.out.println("ff1은 : " + ff1 + " 이다.");
		System.out.println("ff2은 : " + ff2 + " 이다.");
		
		// double은 크기가 float 보다 크고 애초에 double을 넣으려 했기 때문에
		// 뒤에 다른 수식을 쓰지 않아도 사용할 수 있음
		double dd1 = 3.14;
		System.out.println("double dd1 : " + dd1 + " 이다.");
		
		
		// 5. 논리형
		// 논리형은 boolean을 사용해서 true 인지 false 인지 표현할 수 있음
		// 추후 알고리즘이나 if, for, while 문에서 자주 사용
		
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("오늘 날씨는 " + isTrue);
		System.out.println("내일 날씨는 " + isFalse + " ?");
		
		// 정수 문자 문자열 실수 논리형 
		int num = 10;
		System.out.println("정수 num의 값 = " + num);
		
		char ch = 'Z';
		System.out.println("문자 ch의 값 = " + ch);
		
		String text = "Hello World";
		System.out.println("문자열은 text = " + text);

		double db2 = 3.14;
		System.out.println(db2);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = " + isTrue2);
		
		System.out.println("num = " + num);
		// num 에다가 10 대신에 20을 넣고 싶다면? 
		
		num = 20; // 위에 num 이 있으므로 20으로 바꾸기 위해서는 int를 적지 않음
		// 지정값은 처음 1회만 사용한 후 변수명을 변경할 때에는 지정값을 생략함
		System.out.println("num = " + num);
		
		/*
		 * 철수는 19살이었다.
		 * 그런데 24년이 되면서 20살이 되었다.
		 * */
		String name1 = "철수";
		String age = "19";
		System.out.println(name1 + "는 " + age + "살이었다.");
		age = "20";
		System.out.println("그런데 24년이 되면서 " + age + "이 되었다.");
	}
}
