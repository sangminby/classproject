package SoloTest;

public class PersonMain {

//	main()메소드를 정의해봅시다. 
	public static void main(String[] args) {
		
//		① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
		Male m = new Male("손흥민", "9501011000000", "손");
		Female f = new Female("son", "6402022000000", "발");
		
//		② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
		m.print();
		System.out.println();
		f.print();
		
	}
}
