package Chapter06;

public class ArrayTest03 {

	public static void main(String[] args) {

		
		// 10명의 국어점수를 저장하는 배열 선언하고 생성
		int[] korScore = new int[10];
		
		// 배열 요소의 초기화
		korScore[0] = 90;
		korScore[1] = 80;
		korScore[2] = 70;
		korScore[3] = 60;
		korScore[4] = 50;
		korScore[5] = 90;
		korScore[6] = 10;
		korScore[7] = 20;
		korScore[8] = 30;
		korScore[9] = 42;
		
		System.out.println();
		sum(korScore);
		
	}
	
	public static void sum(int[] arr) {
		
		// arr -> korScores 의 배열 인스턴스 주소
		
		int sum = 0;
		
		// sum = korScroe[0]+korScroe[1]+korScroe[2]+ ... korScroe[9]
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("총점: " + sum);
		System.out.println("반 평균: " + (float)sum/arr.length);
		
	}
	
	
	
	
	
	
	
	
	
	

}
