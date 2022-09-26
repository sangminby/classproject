package Chapter08.phone;

public class SmartPhone extends Computer implements Phone {

	boolean power;

	public SmartPhone(String aacount) {
		super(aacount);
		this.power = false;
		
	}
	
	@Override
	public void call() {
		// 119에 전화를 합니다.
		// 상수를 이용해서 번호를 만들고 출력
		String number1 = String.valueOf(Phone.PHONE_NUM_1);
		String number9 = String.valueOf(Phone.PHONE_NUM_9);
		
		System.out.println(number1+number1+number9+"에 전화를 합니다. 불났어요!!");
	
	}

	@Override
	public void trunOn() {
		
		// true -> 전원이 있는 상태
		// false -> 전원이 없는 상태
		
		if(!power) {
			power = true;
		}
	}

	@Override
	public void trunOff() {
		if(!power) {
			power = false;
		}
	}
	
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone("cool@gmail.com");
		
		phone.call();
		phone.calculator();
		
	}
}
