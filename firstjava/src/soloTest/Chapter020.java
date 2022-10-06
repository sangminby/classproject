package soloTest;

import java.util.Scanner;

public class Chapter020 {

	public static void main(String[] args) {

				//		⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		Scanner lsm = new Scanner(System.in);
		
		int num = 0;
		
		//		① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
		String name = null;
	
		//		② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
		int age = 0;
		
		//		③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
		double height = 0.0;
		
		//		④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
		boolean hasbook = true;
		
		System.out.println("이름을 입력해주세요.");
		name = lsm.nextLine();
		
		System.out.println("나이를 입력해주세요.");
		age = lsm.nextInt();
		
		System.out.println("키를 입력해주세요.");
		height = lsm.nextDouble();
		
		System.out.println("책 보여 여부를 입력해주세요.");
		hasbook = lsm.nextBoolean();
		
		
		System.out.println("저는 " + name + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("자바책의 보유여부" + hasbook);
		
		
	}
	


}
