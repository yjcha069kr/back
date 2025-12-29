package ch07_상속.ex05_protected.pack1;

// A, B는 같은 패키지에 존재
public class B {
	//메소드 선언
	public void method() {
		A a = new A();		//o
		a.field = "value"; 	//o
		a.method(); 		//o
	}
}