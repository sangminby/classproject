package soloTest;

import java.time.LocalDate;

//Person 이라는 클래스를 정의해봅시다.
public class Person {


//	② 인사하는 메소드를 정의해봅시다.
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	
//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	String name;
	String pNum;
	
	public Person(String name, String pNum) {
		this.name = name;
		this.pNum = pNum;
	}
	
	int age() {
		
		int num = 0;	// 초기값 초기화
		
		String first = pNum.substring(0, 2);	// 주민번호 앞자리 3개 010/ 101
		String end = pNum.substring(6, 7);		// 주민번호 뒷자리 2개 10/ 00000
		
		int year = LocalDate.now().getYear();		// 현재 연도
		int birth = Integer.parseInt(first);		// 태어난 연도
		int mw = Integer.parseInt(end);				// 1,2 = 1900년대생 3,5 = 2000년대생
		
		if(mw == 1 || mw == 2) {
			num = year - (1900+birth)+1;
		} else if (mw == 3 || mw == 4) {
			num = year - (2000+birth)+1;
		}
		return num;
	}
	
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	void print() {
		System.out.printf("안녕하세요. 저는 %s입니다. %d살입니다.", this.name, age());
		
	}
	
	
	
	
	
	
	
	
}
