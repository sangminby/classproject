package Chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam4Main {

	public static void main(String[] args) {
		
//		4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다. 
		
		LocalDate now = LocalDate.now();	// 현재날짜
		LocalDate birth = LocalDate.of(1995, 10, 9);
		
		long day = ChronoUnit.DAYS.between(birth, now);
		System.out.println("나는 " + day + "일동안 살았습니다.");
		
	}
}
