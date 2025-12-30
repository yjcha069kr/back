package ch09_중첩.ex02_정적멤버클래스;

public class AExample {
	public static void main(String[] args) {
		// class B가 A의 인스턴스 멤버일때
	
		//B 객체 생성
		A.B b = new A.B();
	}
}