package ch02_데이터와변수;

/**
 * 단위: bit(비트) -> byte(바이트)
 * 데이터 용량: 
 * 	1000byte = 1KB(킬로)
 * 	1000KB = 1MB(메가)
 * 
 *  1000MB = 1GB(기가)
 *  1000GB = 1TB(테라)
 * 
 * 정수의 타입
 * 1. byte	1byte = 8bit -> 2의 8승 -> 256가지 숫자(-128 ~ 127)
 * 2. short	2byte = 16bit -> 2의 16승 -> 65,536가지 숫자(-32,768 ~ 32,767)
 * 3. int	4byte = 32bit -> 2의 32승 -> 4,294,967,296가지 숫자(+-21억)
 * 4. long	8byte = 64bit -> 2의 64승 -> +-922경
 * 5. char	2byte = 16bit -> 2의 16승 -> 65,536가지 숫자(0 ~ 65535(유니코드))
 */

public class Ex04_long정수 {

	public static void main(String[] args) {
		// 찾기/바꾸기: ctrl+f
		// alt+shift+a(다중 편집 상태) -> shift+↑↓ 다중 커서 생성 후 수정
		long var2 = -30;
		long var1 = -128;
		long var3 = 0;
		long var4 = 30;
		long var5 = 127;
		// byte var6 = 128; // 에러: 허용범위초과, int로 바꾸기
		
		// 출력
		System.out.println("var1: " + var1); // -128
		System.out.println("var2: " + var2); // -30
		System.out.println("var3: " + var3); // 0
		System.out.println("var4: " + var4); // 30
		System.out.println("var5: " + var5); // 127

	}

}
