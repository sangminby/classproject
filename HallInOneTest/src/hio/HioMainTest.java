package hio;

import java.util.Scanner;

public class HioMainTest {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			
			hioMenuTest();
			System.out.println("메뉴선택 >> ");
			int mainNo = Integer.parseInt(sc.nextLine());
			
			switch(mainNo) {
			
			case 1:
				break;
				
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			
			}
			
			
		}
		

	}

	public static void hioMenuTest() {
		
		System.out.println("======= 초기메뉴 =======");
		System.out.println(" 1. 로그인");
		System.out.println(" 2. 회원가입");
		System.out.println(" 3. 종료");
		System.out.println("======================");
	}
	
	public static void hioAdminMenuTest() {
		
		System.out.println("======= 관리자 메뉴 =======");
		System.out.println(" 1. 가입한 회원 전체리스트");
		System.out.println(" 2. 예약홀 관리");
		System.out.println(" 3. 회원 삭제");
		System.out.println(" 4. 로그아웃");
		System.out.println("=========================");
	}
	
	public static void hioMemberMenuTest() {
		
		System.out.println("======= 회원 메뉴 =======");
		System.out.println(" 1. 예약리스트");
		System.out.println(" 2. 홀 예약");
		System.out.println(" 3. 홀 예약 변경");
		System.out.println(" 4. 홀 예약 취소");
		System.out.println(" 5. 로그아웃");
		System.out.println("=======================");
		
		
	}
	
	
	
}
