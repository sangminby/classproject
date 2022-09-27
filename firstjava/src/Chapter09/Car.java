package Chapter09;

public class Car extends Object {
	
	String name;
	
	Car(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Car car1 = new Car("그랜져");
		Car car2 = new Car("소나타");
		
		System.out.println(car1);		// toString() => 클래스의 풀네임@해시코드16진수
		System.out.println(car1.hashCode());
		System.out.println(car2);
		
	}
}
