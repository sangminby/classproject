package Chapter08;

public class Iphone extends Phone {
	
		public Iphone(String phoneNumber) {
			super(phoneNumber);
		}

		@Override
		void turnOn() {
			System.out.println("아이폰의 전원을 켭니다.");
			power = true;
		}

}
