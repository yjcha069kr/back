package ch12_제네릭.ex02_제네릭타입;
	
public class CarAgency implements Rentable<Car1>{
	@Override
	public Car2 rent() {
		return new Car2();
	}
}