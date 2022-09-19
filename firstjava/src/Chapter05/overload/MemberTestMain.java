package Chapter05.overload;

import java.util.Scanner;

public class MemberTestMain {

//	④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
	public static void main(String[] args) {
		
			
		MemberTest mt1 = new MemberTest("손흥민", "01074200195", "축구", 3, "sangminby@naver.com", "10월9일", "서울 강동구");
		
		mt1.showInfo();
		
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		System.out.println("생일을 입력해주세요.");
		String birth = in.nextLine();
		System.out.println();
		
		System.out.println("주소를 입력해주세요.");
		String add = in.nextLine();
		
		MemberTest mt2 = new MemberTest("손흥민", "01074200195", "축구", 3, "sangminby@naver.com", birth, add);
	
		mt2.showInfo();
		
	}
}
	
