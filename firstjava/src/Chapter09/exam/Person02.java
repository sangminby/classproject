package Chapter09.exam;

public class Person02 {
		
		String name;
		String personNumber;
		
		public Person02(String name, String personNumber) {
			this.name = name;
			this.personNumber = personNumber;
		}

//		1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 
		// "000000-0000000"
		@Override
		public boolean equals(Object obj) {
			
			boolean result = false;
			
			// 매개변수로 전달받은 객체와 비교 : 주민번호
			if(obj != null && obj instanceof Person02) {
				// object -> Person
				Person02 person = (Person02)obj;
				result = this.personNumber.equals(person.personNumber);
			}
			return result;
		}
		
	public static void main(String[] args) {
			
			Person02 p1 = new Person02("son", "000000-0000000");
			Person02 p2 = new Person02("kong", "000000-1111111");
			Person02 p3 = new Person02("king", "111111-7777777");
			
			System.out.println("p1과 p2는 같은 사람인가? => " + p1.equals(p2));
			System.out.println("p1과 p3는 같은 사람인가? => " + p1.equals(p3));

	}
}
