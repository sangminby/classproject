package chapter02;

import java.util.Scanner;

// chapter02 Member
public class Member {

	public static void main(String[] args) {
	
		
	/* ① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다. 
	   ② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다. 
	   ③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
	   ④ boolean 타입의 JAVA책의 보유여부를 저장할 수 있는 변수 hasBook를 정의해봅시다. 
	   ⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다. */
	
		
		Scanner in = new Scanner(System.in);
	
		
		String name = null;
		int age = 0;
		String nickname = null;
		double height = 0.0;
		boolean hasbook = false;
		
		// name = "이상민"; 
				// age = 20; 
				// height = 185.0; 
				// hasbook = true;
		
		System.out.println("이름을 입력해주세요. >>>");
		name = in.nextLine();
		
		System.out.println("나이를 입력해주세요. >>>");
		age = in.nextInt();
		
		in.nextLine();
		
		System.out.println("별명을 입력해주세요. >>>");
		nickname = in.nextLine();
		
		System.out.println("키 정보를 입력해주세요. >>>");
		height = in.nextDouble();
		
		System.out.println("책 보유여부를 입력해주세요. >>>");
		hasbook = in.nextBoolean();
	
		
		
	
		System.out.println("저의 이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세입니다.");
		System.out.println("키는 " + height + "cm입니다.");
		System.out.println("자바 책의 보유 여부 : " + hasbook);
		
	
	}
}

