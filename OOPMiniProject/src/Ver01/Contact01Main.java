package Ver01;

import java.util.Scanner;

public class Contact01Main {
	
	// main()메소드를 정의합니다
	public static void main(String[] args) {
		
		//	 위 데이터를 출력하는 기능
		Scanner in = new Scanner(System.in);
		
		Contact01 c1 = new Contact01();
		
//		System.out.println("저장완료" + "\n");
//		System.out.println("이름을 입력해주세요.");
//		in.nextLine();
//		System.out.println("번호를 입력해주세요.");
//		in.nextLine();
//		System.out.println("메일을 입력해주세요.");
//		in.nextLine();
//		System.out.println("주소를 입력해주세요.");
//		in.nextLine();
//		System.out.println("생일을 입력해주세요.");
//		in.nextLine();
//		System.out.println("그룹을 입력해주세요.");
//		in.nextLine();
		
		c1.setName(in.nextLine());
		c1.showInfo();
	}
}
