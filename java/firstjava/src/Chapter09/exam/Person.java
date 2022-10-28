package Chapter09.exam;

public class Person {

//	1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다
	String name;
	String personNumber;
	
	Person(String personNumber) {
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object ob) {
		
		boolean result = false;
		
		if(ob != null && ob instanceof Person) {
			
			Person ps = (Person)ob;
			result = this.personNumber.equals(ps.personNumber);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Person ps1 = new Person("9501011000000");
		Person ps2 = new Person("9501011000000");
		
		if(ps1.equals(ps2)) {
			System.out.println("같은 주민번호입니다.");
		} else {
			System.out.println("다른 주민번호 입니다.");
		}
		
	}
}
