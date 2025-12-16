package ch05;

/**
 * 문자열
 *  1. 문자열.charAt(인덱스)
 *  	- 문자열에서 지정한 위치(index)의 문자 하나를 반환
 *  	- index는 0이상 문자열 길이 미만
 *  	-> 범위를 초과하면 StringIndexOutOfBoundsException 발생
 *  2. 문자열.length()
 *  	- 문자열의 길이(문자수) 반환
 *  3. 문자열.replace(이전문자열, 대체문자열)
 *  	- 문자열에서 이전문자열을 대체문자열로 치환한 새로운 문자열 반환
 *  4. 문자열.substring()
 *  5. 문자열.indexOf()
 *  6. 문자열.contains()
 *  7. 문자열.split()
 */
public class Ex04_문자열매서드 {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		
		// 문자열.charAt
		char gender = ssn.charAt(6);
		switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}

		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);
		
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
