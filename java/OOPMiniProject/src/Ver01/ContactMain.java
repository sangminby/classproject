package Ver01;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
		// Contact 인스턴스 생성 : 생성자를 이용한 데이터 초기화
		Contact c2 = new Contact("손흥민", "010-1111-2222", "son@naver.com", "런던", "1999-10-12", "가족");
		
		Scanner up = new Scanner(System.in);
		
		
//		System.out.println("이름: " + c2.getName());
//		System.out.println("번호: " + c2.getNumber());
//		System.out.println("메일: " + c2.getEmail());
//		System.out.println("주소: " + c2.getAddress());
//		System.out.println("생일: " + c2.getBirthday());
//		System.out.println("그룹: " + c2.getGroup());
//		
//		System.out.println();
//		c2.printData();
		
		// 인스턴스의 각 변수의 값을 바꾸는 
//		c2.setName("박지성");
//		c2.setNumber("010-2222-1111");
//		
//		System.out.println();
//		c2.printData();
		
		while(true) {
		System.out.println();
		System.out.println();
		System.out.println("y. 입력시작 | n. 종료");
		String select = up.nextLine();
		
		// 사용자 요청에 따라 프로그램 종료/진행 -> 분기
		if(select.equals("n")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else if(!select.equals("y")) {
			System.out.println("올바른 요청이 아닙니다.");
			continue;
		} 
		
			System.out.println("데이터를 입력을 시작합니다.");
			
			System.out.println("이름 >>>");
			String name = up.nextLine();

			System.out.println("번호 >>>");
			String number = up.nextLine();

			System.out.println("이메일 >>>");
			String email = up.nextLine();

			System.out.println("주소 >>>");
			String address = up.nextLine();

			System.out.println("생일 >>>");
			String birthday = up.nextLine();

			System.out.println("그룹 >>>");
			String group = up.nextLine();
			
			Contact c = new Contact(name, number, email, address, birthday, group);
			
			c.printData();
			
			
		}
	}
}
