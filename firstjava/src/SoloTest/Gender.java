package SoloTest;

//Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다. 
public class Gender {
//extends Person

//	① 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	String male;

//	③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
	public Gender(String name, String pNum) {
		super(name, pNum);
		this.male = male;
	}
	
	int gender() {
		
		String end = pNum.substring(6, 7);
		int gender = Integer.parseInt(end);
		
		if(gender == 1 || gender == 3) {
			System.out.println("\n성별은 남자입니다.");
		} else {
			System.out.println("\n성별은 여자입니다.");
		}
		return gender;
	}

//	③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.	
	@Override
	void print() {
		super.print();
		System.out.println(gender());
	}
}
