package Chapter03.exam;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Scanner lsm = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력해주세요. ------ ");
		int num1 = lsm.nextInt();

		System.out.println();

		System.out.println("두번째 숫자를 입력해주세요. ------ ");
		int num2 = lsm.nextInt();

		System.out.println("결과값 -----------------------");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);

		System.out.println("원의 반지름을 입력해주세요.");
		double circle = lsm.nextDouble();

		System.out.println();

		System.out.println("원의 둘레: " + cir(circle));
		System.out.println("원의 넓이: " + area(circle));
	}

	public static void add(long num1, long num2) {
		System.out.println("더하기: " + (num1 + num2));
	}

	public static void sub(long num1, long num2) {
		System.out.println("빼기: " + (num1 - num2));
	}

	public static void mul(long num1, long num2) {
		System.out.println("곱하기: " + (num1 * num2));
	}

	public static void div(long num1, long num2) {
		System.out.println("나누기: " + (num1 / num2));
	}

	public static double cir(double r) {
		return 2 * 3.14 * r;
	}

	public static double area(double r) {
		return 3.14 * r * r;
	}
}
