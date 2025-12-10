package ch02_데이터와변수;

/**
 * Java 13 버전 이후
 * 	 텍스트 블록 문법(""")
 * 		""" 로 감싸면 작성된 그대로 문자열로 저장
 * 		형식:
 * 			String str = """내용"""; 
 * Java 14 버전 이후
 * 		줄바꿈 하지 않고 다음 줄에 이어서 작성하고 싶으면
 * 		끝에 \ 붙인다.
*/
public class Ex09_텍스트블록문법 {

	public static void main(String[] args) {
		// escape 문법
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\"\n" +
				"}";
		
		// 텍스트 블록 문법
		String str2 = """
				{
					"id":"winter,
					"name":"눈송이"
				}
				""";
		
		// 출력
		System.out.println(str1);
		System.out.println("---------------------------");
		System.out.println(str2);
		System.out.println("---------------------------");
		
		// 이어 작성하기 (\)
		String str3 = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될것입니다.
				""";
		System.out.println(str3);

	}

}
