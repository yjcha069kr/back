package ch02_데이터와변수;


/**
 * 데이터타입
 * 1. 기본타입: 정수(byte, short, int, long, char), boolean
 * 2. 참조타입: String
 * 
 * 문자 VS 문자열
 * 1. 문자 리터럴
 * 		- 하나의 문자를 ''로 감싼 것
 * 		- 유니코드로 변환되어 저장
 * 		- ''로 감싼 하나의 문자는 char 타입
 * 		- ""로 감싼 여러 개의 문자는 유니코드로 변환되지 않음
 * 		- 문자열을 변수에 저장할때는 String 타입 사용(String 타입은 참조 타입)
 * 
 * 특수문자(escape 문자)
 * 1. \'
 * 2. \"
 * 3. \\
 * 4. \t	탭
 * 5. \n	줄 바꿈
 * 6. \r	캐리지 리턴(CR, Carriage Return)
*/
public class Ex08_문자열 {

	public static void main(String[] args) {
		//char var1 = "A"; // char 타입은 단일 따옴표 리터럴 사용
		//char var2 = '홍길동'; // char 타입은 단일 문자 하나만 사용
		//char var3 = ''; // 빈 문자열x
		
		String str1 = "A";
		String str2 = ""; // 빈 문자열
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(name);
		System.out.println(job);
		
		// 특수문자
		// String str = "나는 "자바"를 배웁니다."; // 에러
		// String str = '나는 "자바"를 배웁니다.'; // 에러
		// String str = "나는 '자바'를 배웁니다."; // o
		String str = "나는 \"자바\"를 배웁니다."; // 에러
		System.out.println(str);
		
		// 줄 바꿈
		str = "나는\n자바를\n배웁니다.";
		System.out.println(str);
		// println() 메서드는 줄바꿈 처리 O
		System.out.println("나는");
		System.out.println("자바를");
		System.out.println("배웁니다.");
		// print() 메서드는 줄바꿈 처리 X -> \n 써주기
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.\n");
		
		str = "번호	이름	직업";
		String record1 = "1	허준	의사";
		String record2 = "100	홍길동	개발자";
		// str = "번호\t이름\t직업";
		System.out.println(str);
		System.out.println("----------------------");
		System.out.println(record1);
		System.out.println(record2);

	}

}
