package soloTest;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam10Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
		
		System.out.println("아이디를 입력해주세요 >> ");
		String s = sc.nextLine();
		
		boolean cheak = Pattern.matches("^[a-z0-9A-Z]*$", s);
		
			try {
				if(!cheak) {
					BadIdInputException bad = new BadIdInputException();
					throw bad;
				}
			} catch (BadIdInputException bad) {
				System.out.println(bad.getMessage());
				sc.nextLine();
				System.out.println("시스템을 종료합니다.");
			}
		
			
//		2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
//		이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.
		
		int birth = 0;
		
		System.out.println("태어난 년도를 입력해주세요 >> ");
		
		try {
			birth = sc.nextInt();
			System.out.println("출생년도 : " + birth);
			
		} catch (InputMismatchException in) {
			System.out.println("숫자만 입력해주세요.");
		}
	}
	
}
