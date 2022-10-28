package soloTest;

public class Chapter01 {
	public static void main(String[] args) {
		
		System.out.println("10+20= " + add(10, 20));
		System.out.println("10-20= " + sub(10, 20));
		System.out.println("10*20= " + mul(10, 20));
		System.out.println("10/20= " + div(10, 20));
	}
	
	//① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	public static long add(long num1, long num2) {
	return num1 + num2;
	}
	//② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	public static long sub(long num1, long num2) {
	return num1 - num2;
	}
	//③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	public static long mul(long num1, long num2) {
	return num1 * num2;
	}
	//④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	public static float div(float num1, float num2) {
	return num1 / num2;
	}
}
