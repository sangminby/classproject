package Chapter07;

public class SmartPhone02 extends Phone {

	String model;
	
	SmartPhone02(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	// 오버라이딩
	// 상위 클래스에서 정의한 메소드를 재 정의
	// 선언부는 동일하게 정의하고 처리블록 내부의 코드만 재 정의
	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화합니다.");
		//System.out.println("하위 클래스에서 재 정의");
	}
	
	public static void main(String[] args) {
		
		SmartPhone02 phone02 = new SmartPhone02("010-0000-0000", "삼성");
		
		// call() 호출
		phone02.call();
		
	}
	
}
