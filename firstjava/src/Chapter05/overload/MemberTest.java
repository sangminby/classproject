package Chapter05.overload;

public class MemberTest {
	
	//	① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String number;
	String major;
	int level;
	String email;
	String birth;
	String add;
	
	// ② 위에서 정의한 정보를 출력하는 메소드 정의
	
	// ③ 모든 정보를 저장하도록 하는 생성자
	MemberTest(String name, String number, String major, int level, String email, String birth, String add) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.level = level;
		this.email = email;
		this.birth = birth;
		this.add = add;	
	}
	
	// ③ 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	MemberTest(String name, String number, String major, int level, String email) {
		this(name, number, major, level, email, " ", " ");
	}
	
	void showInfo() {
		System.out.println("개인정보"+ "\n");
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + number);
		System.out.println("전공: " + major);
		System.out.println("학년: " + level + "학년");
		System.out.println("이메일: " + email);
		System.out.println("생일: " + birth);
		System.out.println("주소: " + add);
	
	}
}
