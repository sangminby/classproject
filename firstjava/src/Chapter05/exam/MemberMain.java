package Chapter05.exam;

public class MemberMain {
	
	public static void main(String[] args) {
		
		Member m1 = new Member("손흥민", "010-1111-2222", "축구", 1, "son@gmail.com", 20000101, "런던");
		m1.showInfo();
		
		
		Member m2 = new Member("손흥민", "010-9999-77777", "체육", 4, "sonking@gmail.com");
		m2.showInfo();
	}
}
