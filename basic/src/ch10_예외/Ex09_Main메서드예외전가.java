package ch10_예외;

/**
 * main() 메서드에서도 throws 키워드를 사용해서 예외를 떠넘길수 있음.
 * -> JVM은 예외의 내용을 콘솔에 출력하는 것으로 예외처리함.
 */
public class Ex09_Main메서드예외전가 {
	public static void main(String[] args) throws Exception {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}