package ch12_제네릭.ex02_제네릭타입;

public class Box3<T> {
	public T content;

	//Box의 내용물이 같은지 비교
	public boolean compare(Box3<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}