package ch02_데이터와변수;

/**
 * 타입 변환
 * 1. 자동 타입 변환
 * 		- 값의 허용 범위가 작은 타입에서 큰 타입으로 대입될때 발생
 * 		예) char(2) -> int(4) -> long(8) -> float(4) -> double(8)
 * 		예) byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
 * 
 * 2. 강제 타입 변환
 * 		- 허용 범위가 큰 타입을 작은 타입으로 쪼개서 저장하는것
 * 		- 형식:
 * 				타입 변수 = (타입) 변수
 * 
 * 3. 연산식에서 자동 타입 변환
 * 
*/
public class Ex10_타입변환 {

	public static void main(String[] args) {
		// ********자동 타입(형) 변환********
		// byte -> int
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		// char -> int
		char charValue = '가';
		intValue = charValue;
		System.out.println("'가'의 유니코드: " + intValue);
		
		// int -> long
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		// long -> float
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		// float -> double
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		// ********강제 타입 변환********
		// int -> byte
		int var1 = 10;
		// 타입 변수명 = (타입) 변수명;
		byte var2 = (byte) var1;
		System.out.println("var2: " + var2);
		
		// long -> int
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println("var3:" + var3);
		
		// int -> char
		var1 = 65;
		char var5 = (char) var1;
		System.out.println("var5:" + var5);
		
		// double -> int
		double var6 = 3.14;
		var1 = (int) var6;
		System.out.println("var1:" + var1);
		
		// 연산식에서 자동 타입 변환
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1);
		
		// int 타입으로 변환 후 연산->할당됨
		// byte + byte -> int
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		// long 타입 리터럴은 끝에 L 써야됨
		long v5 = 1000L;
		// long 타입으로 변환되어 연산->할당
		long result3 = v3 + v4 + v5;
		System.out.println("result3: " + result3);
		
		// 연산식에서 int 타입보다 작은 타입의 연산은 int 타입으로 변환되어 연산
		char v6 = 'A'; // int 타입에서 'A' -> 65로 할당
		char v7 = '1'; // int 타입에서 '1' -> 49로 할당
		int result4 = v6 + v7;
		System.out.println("result4: " + result4);
		
		// 정수 연산의 결과는 정수
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		
		// 연산 전 double 타입으로 변환되어 연산
		double result6 = v8 / 4.0;
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		System.out.println("result7: " + result7);

	}

}
