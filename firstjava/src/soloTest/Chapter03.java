package soloTest;

import java.util.Scanner;

public class Chapter03 {

	public static void main(String[] args) {
//		⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
//		⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
//		에 추가해봅시다.
		
	Scanner lsm = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력해주세요.");
		int num1 = lsm.nextInt();
		
		System.out.println("숫자 2를 입력해주세요.");
		int num2 = lsm.nextInt();
		
		System.out.println("계산결과===========");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		System.out.println();
		System.out.println("원의 반지름을 입력해주세요.");
		double b = lsm.nextDouble();
		
		System.out.println("원의 둘레: " + cir(b));
		System.out.println("원의 넓이:" + are(b));
		
	}
	//	① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	public static void add(int num1, int num2) {
		System.out.println("두 수의 덧셈결과: " + (num1+num2));
	}
	//	② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	public static void sub(int num1, int num2) {
		System.out.println("두 수의 뺄셈결과: " + (num1-num2));
	}
	//	③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	public static void mul(int num1, int num2) {
		System.out.println("두 수의 곱셈결과: " + (num1*num2));
	}
	//	④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	public static void div(int num1, int num2) {
		System.out.println("두 수의 곱셈결과: " + (num1/num2));
	}
	//	⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	public static double cir(double a) {
		// 원의 둘레 : 2 x π x r
		return 2 * 3.14 * a;
	}
	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	public static double are(double a) {
		// 원의 넓이 : π x r  x r
		return 3.14 * a * a;
	}
}
