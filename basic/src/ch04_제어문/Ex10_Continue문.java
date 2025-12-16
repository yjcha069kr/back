package ch04_제어문;

/**
 * break문
 * 	- 제어문 종료
 * continue문
 * 	- continue 이후 문장은 실행하지 않고,
 * 	- for문은 증감식으로, while문은 조건식으로 이동하여 제어문을 계속 실행
 */
public class Ex10_Continue문 {

	public static void main(String[] args) {
		// i는 1부터 10까지 10번 반복
		for(int i=1; i<=10; i++) {
			// i를 2로 나누었을때 나머지가 0과 같지 않으면(=홀수이면)
			if(i%2 != 0) {
				continue;
				// System.out.print(i + " "); 에러
			}
			System.out.print(i + " ");
		}

	}

}
