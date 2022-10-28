package first;

public class PrintMethodTest {

	public static void main(String[] args) {
		
		
		// print 메소드 : 매개변수로 전달하는 데이터를 출력
		System.out.print("개인소개");
		
		// println : 매개변수로 전달된 데이터를 출력하고 개행
		System.out.println();
		
		System.out.print("이름 : 손흥민");
		System.out.println();
		System.out.println("나이 : 29");
		
		System.out.println("직업 : 축구선수");
		
		System.out.println();
		
		// printf("문자열의 규칙", 데이터, 데이터, 데이터)
		// 정수 : %d
		// 문자열 : %s
		// 실수 : %f, %e
		
		// 문자열 저장 변수선언 : string 변수이름 = "손흥민";
		String userName = "손흥민";
		int age = 29;
		float height = 182.1f;
		String job = "축구선수";
		
		System.out.printf("이름 : %s , 나이 : %d, 키 : %f cm, 직업 : %s", "손흥민", 29, 180.1f, "축구선수");
		
		System.out.println();
		
		System.out.printf("이름 : %s , 나이 : %d, 키 : %f cm, 직업 : %s", userName, age, height, job);
		
	}
}
