package ch07_상속.ex05_protected.pack2;

import ch07_상속.ex05_protected.pack1.A;  //ctrl+shift+o: 자동임포트

/**
 * protected 접근 제한자
 * 	- new 연산자를 사용해서 생성자를 직접 호출하지 못함
 * 	-> 자식 생성자에서 super()로 부모 생성자 호출 가능
 */
//A, D는 다른 패키지에 존재 & A 클래스를 상속받음
public class D extends A {
	//생성자 선언
	public D() {
		//A() 생성자 호출
		super();				//o
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value"; 	//o
		//A 메소드 호출
		this.method(); 			//o
	}
	
	//메소드 선언
	public void method2() {
		//A a = new A();		//x
		//a.field = "value"; 	//x
		//a.method(); 			//x
	}	
}