package Chapter04.exam;

public class Exam01 {

	public static void main(String[] args) {
		
		//문제 1. for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
		
		// ((((1*2)*3)*4)...*10)
		
		int result = 1;
		int sum = 0;
		
		for(int num =1; num < 11; num++) {
			//System.out.println(num);
			//result = result * 1;
			result *= num;
			System.out.println(num + " : " + result + "\n");   // \n : 줄 띄어쓰기
		}
	


	}
}
