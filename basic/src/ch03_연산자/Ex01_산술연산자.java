package ch03_연산자;


/**
 * 산술연산자
 * 		+	덧셈, 부호(양수), 문자열 결합
 * 		-	뺄셈, 부호(음수)
 * 		*	곱셈
 * 		/	나눗셈
 * 		%	나머지
 * 		++	1씩 증가
 * 		--	1씩 감소
 */
public class Ex01_산술연산자 {

	public static void main(String[] args) {
		// 부호 연산
		int x = -100;
		x = -x;
		
		byte b = 100;
		// byte의 유효 범위: -128~127
		// 연산 시 할당 전에 int로 바뀜
		byte y = (byte) -b; // 저장공간 줄일때 사용
		int y2 = -b; // 이게 편해서 이거 씀
		
		System.out.println("x: " + x); // x: 100
		System.out.println("y: " + y); // y: -100
		System.out.println("y2: " + y2); // y: -100

	}

}
