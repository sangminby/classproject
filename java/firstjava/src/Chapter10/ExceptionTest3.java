package Chapter10;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		try {
			check1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	static void check1() throws ClassNotFoundException {
			check2();
	}
		
	
	static void check2() throws ClassNotFoundException {
			
		Class.forName("NULL");	
	}
	
}
