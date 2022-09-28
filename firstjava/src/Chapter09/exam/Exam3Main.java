package Chapter09.exam;

import java.util.Scanner;

public class Exam3Main {

	public static void main(String[] args) {
		
//		3. 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 공백으로 입력되었는지도 판별하는 
//		프로그램을 만들어봅시다
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름을 적어주세요 >> ");
			String name = scan.nextLine();
		
			if(name.trim().length()==0) {
				System.out.println("공백은 사용이 불가능합니다.");
			} else { 
				if(check(name)) {
					System.out.println(name);
					break;
				} else {
					System.out.println("영문자 대소문자만 입력가능합니다.");
				}
			
			}
		}
}	
	
	static boolean check(String name) {
		
		boolean result = true;
		
		for(int i=0; i<name.length(); i++) {
			
			char c = name.charAt(i);
			
			if(!(c>='a' && c<='z' || c>='A' && c<='Z')) {
				result = false;
				break;
			}
		} 
		return result;
	}
}	
