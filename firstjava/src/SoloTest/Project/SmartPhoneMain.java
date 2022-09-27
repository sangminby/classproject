package SoloTest.Project;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp = SmartPhone.get();
		
		// 입력
		sp.insert();
		
		// 전체출력
		sp.all();
		
		// 검색 후 전체출력
		sp.serch();
		
		// 검색 후 정보 수정
		sp.edit();
		sp.serch();
		sp.all();
		
		// 검색 후 삭제
		sp.del();
		sp.serch();
		sp.all();
	
	}
}
