package ch16_스트림.ex06_최종처리;

import java.util.Arrays;
import java.util.List;

/**
 * 요소 커스텀 집계
 * 	- 다양한 집계 결과물을 만들 수 있도록 reduce() 메서드 제공
 *  - reduce()는 스트림에 요소가 없을 경우 예외(NoSuchElementException)가 발생하지만,
 *    identity 매개값이 주어지면 이 값을 디폴트 값으로 리턴한다.
 *    
 *    int sum = stream
 *    	.reduce(0, (a, b) -> a+b);
 *     
 */
public class 커스텀집계 {
	public static void main(String[] args) {
		List<Student2> studentList = Arrays.asList(
				new Student2("홍길동", 92),
				new Student2("신용권", 95),
				new Student2("감자바", 88)
		);		
		//방법1
		int sum1 = studentList.stream()
				.mapToInt(Student2 :: getScore)
				.sum();		
		//방법2
		int sum2 = studentList.stream()
						.map(Student2 :: getScore)
						.reduce(0, (a, b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}