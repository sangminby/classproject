package SoloTest;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam10Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("아이디를 입력해주세요 >> ");
		String s = sc.nextLine();
		
		while(true) {
		
		boolean cheak = Pattern.matches("^[a-z0-9A-Z]*$", s);
		
			try {
				if(!cheak) {
					throw new BadIdInputException();
				}
			} catch (BadIdInputException bad) {
				System.out.println(bad.getMessage());
				sc.nextLine();
			}
			break;
		} 
		
		
//		2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
//		이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.
		
//		System.out.println("태어난 년도를 입력해주세요 >> ");
//		
//		int birth = 0;
//		
//		while(true) {
//		
//			try {
//				birth = sc.nextInt();
//				System.out.println("태어난 년도 : " + birth);
//				
//			} catch(InputMismatchException in) {
//				System.out.println("숫자만 입력가능합니다.\n다시 입력해주세요 >> ");
//				sc.nextInt();
//			}
//			break;
//		}
		
		
		
		
		
		

	}

}
