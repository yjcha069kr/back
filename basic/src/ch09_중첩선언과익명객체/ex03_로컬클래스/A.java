package ch09_중첩.ex03_로컬클래스;

public class A {
	//생성자
	A() {
		//로컬 클래스 선언
		class B { }

		//로컬 객체 생성
		B b = new B();
	}

	//메소드
	void method() {
		//로컬 클래스 선언
		class B { }

		//로컬 객체 생성
		B b = new B();
	}
}