package SoloTest;

//		② 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
public class BadIdInputException extends Exception {
	
	public BadIdInputException() {
		super("영문자와 숫자만 입력가능합니다.\n다시 입력해주세요 >>");
	}

}
