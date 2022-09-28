package Chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam04Main {

	public static void main(String[] args) {
		
//		4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다. 
		
		LocalDate birthDay = LocalDate.of(1995, 10, 9);
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(birthDay, now);
		System.out.println(days);
		
		LocalDate cDay = LocalDate.of(2022, 12, 25);
		
		long cdays = ChronoUnit.DAYS.between(now, cDay);
		System.out.println(cdays);
		
		LocalDate dDay = now.plusDays(88);
		System.out.println(dDay);
		
	}
}
