package Chapter11;

import Chapter08.phone.Phone;
import Chapter08.phone.PhoneImpl;

public class GenaricMethodByType {

	public <T extends Phone> void hello(T t) {
//		System.out.println("안녕하세요. " + t.toString() + "입니다.");
		t.call();
	}
	
	public static void main(String[] args) {
		
		GenaricMethodByType bytype = new GenaricMethodByType();
//		bytype.<String>hello("손흥민");
//		bytype.hello(10);
//		bytype.<PhoneImpl>hello(new PhoneImpl());
//		bytype.hello(new PhoneImpl());
		
	}
}
