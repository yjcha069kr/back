package ch01_시작하기;
/* package 패키지명;
 * 1. 소문자로 기록
 * 2. 숫자 시작x
 * 3. 특수문자는 .과 _
 * 4. 키워드(public, class, package, ...) 사용x
 */
/**
 * 문서 주석(Javadoc): alt+shift+J
 * @author 작성자명
 * 기능: Hello
 * 작성일: 2025-12-09
*/

/*
 * 접근제한자 class 클래스명 {코드}
 * 1. 파스칼 표기법(관례)- 단어별 첫글자를 대문자로
 * 2. _, $, 숫자 가능
 * 3. 키워드(public, class, package, ...) 사용x
*/
public class Ex01_Hello {
	/*
	 * 여러 줄 주석: 영역 선택 후 ctrl+shift+/
	 */
	
	// 문자: char
	// 문자열: string
	// 정수: byte, short, int, long
	// 실수: float, double
	// 불: boolean
	// 배열: []
	// void: "메서드의 리턴값이 없음!"
	// 접근제한자 static void main(데이터타입 인자)- 프로그램의 시작점
	public static void main(String[] args) {
		// ctrl+n	: 새 문서 만들기
		// ctrl+/ : 한 줄 주석
		// ctrl+shift+L	: 단축키 목록		
		// ctrl++/-	: 코드뷰 글자 크기를 확대/축소
		// F2 또는 alt+shift+R : 이름 바꾸기
		// alt+↑↓ : 선택한 영역(줄 단위) 위치 이동
		// ctrl+alt+↑↓	: 선택한 영역(줄 단위) 복제
		// ctrl+d : 선택한 영역(줄 단위) 삭제
		// ctrl+m : 코드뷰 창 최대/원래대로	
		// ctrl+space: 자동 완성
		// ctrl+F11	: 실행
		// ctrl+i : 선택한 영역 자동 들여쓰기
		// ctrl+shift+f	: 자동 들여쓰기
		// alt+shift+y	: 줄 바꿈(토글)
		
		// char '문자'- 문자 1자(예: 'A', 'a', '가')
		// String "문자열"
		// 객체.메서드(인자)
		// print() - 줄바꿈❌❌
		System.out.print("Hello, Java!");
		// println() - 줄바꿈⭕⭕
		System.out.println("Hello, Java!");
		
	}

}
