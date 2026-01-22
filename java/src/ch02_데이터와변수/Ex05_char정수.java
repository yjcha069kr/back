package ch02_데이터와변수;

/**
* 정수의 타입
* 1. byte	1byte = 8bit -> 2의 8승 -> 256가지 숫자(-128 ~ 127)
* 2. short	2byte = 16bit -> 2의 16승 -> 65,536가지 숫자(-32,768 ~ 32,767)
* 3. int	4byte = 32bit -> 2의 32승 -> 4,294,967,296가지 숫자(+-21억)
* 4. long	8byte = 64bit -> 2의 64승 -> +-922경
* 5. char	2byte = 16bit -> 2의 16승 -> 65,536가지 숫자(0 ~ 65535(유니코드))
*/
public class Ex05_char정수 {

	public static void main(String[] args) {
		// ctrl+alt+↑↓	선택한 줄 복제
		// ctrl+F11		실행
		
		// 문자는 '' 로, 문자열은 "" 로 묶음
		char var1 = 'A';
		char var2 = '가';
		char var3 = 65;
		char var4 = 44032;
		String var5 = "A";
		char var6 = 0x0041;
		
		// sysout 쓰고 ctrl+space
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
	}

}
