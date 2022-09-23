package Chapter07;

public class SmartPhoneMain02 {

	public static void main(String[] args) {
		AndroidPhone androidphone = new AndroidPhone("010-0000-0000");
		IPhone iphone = new IPhone("010-1111-1111");
		GoglePhone goglephone = new GoglePhone("010-2222-2222");
		
		callByPhone(androidphone);
		callByPhone(iphone);
		callByPhone(goglephone);
	}
	
	static void callByPhone(Phone phone) {
		// 메소드의 매개변수
		// Phone phone = androidphone;
		phone.call();
		
	}
	
//	// 안드로이드 폰
//	static void callByPhone(AndroidPhone phone) {
//		phone.call();
//	}
//	
//	// 아이폰
//		static void callByPhone(IPhone phone) {
//			phone.call();
//	}
//		
//	// 구글폰
//		static void callByPhone(GoglePhone phone) {
//			phone.call();
//	}
}
