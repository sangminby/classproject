package Chapter08;

public class AbstractClassMain {

	public static void main(String[] args) {

		// 추상 클래스는 인스턴스 생성에 목적이 없다!
		// 인스턴스 생성을 하면 문제가 된다!!
		AbstractClass abstractClass; // = new AbstractClass(); // 인스턴스 생성불가!

		NewClass newclass = new NewClass();
		newclass.abstractMethod();

		abstractClass = newclass; 	// 다형성
		
		abstractClass.abstractMethod();
		
		newclass.printData();

	}

}
