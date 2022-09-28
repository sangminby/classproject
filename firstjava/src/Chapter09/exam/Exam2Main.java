package Chapter09.exam;

public class Exam2Main {

	public static void main(String[] args) {
		
//		2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다. 
		long st = System.currentTimeMillis();
		System.out.println("측정 시작시간 : " + st);
		
		int num = 0;
		
		for(int i=0; i<=100000000; num += i++);
		
		long et = System.currentTimeMillis();
		System.out.println("측정 종료시간 : " + et);
		
		System.out.println("0~100000000 합 : " + num);
		System.out.println("연산 실행시간 : " + (et-st));
		
	}
}
