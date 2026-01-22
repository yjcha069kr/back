package ch04_제어문;

// java.lang 패키지는 import 필요없음
// -> 기본페이지
import java.util.Scanner;
// java.util 패키지의 Scanner 클래스를 사용하기 위헤 import 사용
public class Ex07_While응용 {
	
	public static void main(String[] args) {
		// 참조 타입: String, 클래스, ...
				// new 키워드로 생성한 객체를 특별히 instance(인스턴스)
				// Scanner() 생성자 함수를 통해 sc 객체(인스턴스) 생성

				Scanner sc = new Scanner(System.in);
				// 기본 타입
				boolean run = true;
				int speed = 0;

				while(run) {
					System.out.println("-----------------------------");
					System.out.println("1. 증속 | 2. 감속 | 3. 중지");
					System.out.println("-----------------------------");
					System.out.print("선택: ");

					// nextLine(): 한 줄 전체 입력 (공백 포함)
					// String strNum = sc.nextLine();
					int strNum = sc.nextInt();

					// if(strNum.equals("1")) {
					if(strNum == 1) {
						speed++;
						System.out.println("현재 속도 = " + speed);
					//} else if(strNum.equals("2")) {
					} else if(strNum == 2) {
						speed--;
						System.out.println("현재 속도 = " + speed);
					//} else if(strNum.equals("3")) {
					} else if(strNum == 3) {
						run = false;
					}
				}

				System.out.println("프로그램 종료");
				
				sc.close();

			}

		}