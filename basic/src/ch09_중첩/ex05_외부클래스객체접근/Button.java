package ch09_중첩.ex05_외부클래스객체접근;

public class Button {
	//정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
}
