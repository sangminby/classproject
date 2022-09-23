package Chapter07;

public class SmartPhone extends Phone {
	
	// 하위 클래스 : 상위 클래스 멤버 + 새로운 멤버 정의
	String model;
	
	SmartPhone() {
		super("010-4321-4321"); // 1
		this.model = "IOS"; // 3
	}
	
	// 전화번호만 초기화
	SmartPhone(String phoneNumber) {
		super(phoneNumber);
		this.model = "안드로이드";
	}
	
	SmartPhone(String phoneNumber,String model) {
		super(phoneNumber);
		this.model = model;
	}

	void play() {
		System.out.println("app을 실행합니다.");
	}
	
	public static void main(String[] args) {
		
		//SmartPhone sp = new SmartPhone();
		//SmartPhone sp = new SmartPhone("010-1111-2222");
		SmartPhone sp = new SmartPhone("010-9999-8888", "Gogle");
		
		
		System.out.println(sp.phoneNumber);
		sp.call();
		System.out.println(sp.model);
		sp.play();
	
	}
}
