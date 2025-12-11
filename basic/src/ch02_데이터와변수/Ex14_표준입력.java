package ch02_데이터와변수;

import java.util.Scanner;
// 외부 패키지, 클래스를 가져올 때(자동 임포트 됨)
// java.lang 패키지 외의 모든 외부 패키지는 임포트해서 사용!
import java.util.Scanner;

public class Ex14_표준입력 {

	public static void main(String[] args) {

		
		// 창조타입 변수 = new 생성자(인자);
		// Scanner 변수 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		// 콘솔에서 ㅣㅇㅂ력한 정보를 strX에 할당
		System.out.print("x값 입력: ");
		String strXString = sc.nextLine();
		System.out.println(strX);
		

	}

}
