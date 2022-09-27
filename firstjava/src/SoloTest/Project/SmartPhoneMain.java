package SoloTest.Project;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp = SmartPhone.get();
		
		sp.insert();
		sp.all();
		sp.serch();
		
		sp.edit();
		sp.serch();
		sp.serch();
		sp.all();
		
		sp.del();
		sp.serch();
		sp.all();
		
		
		
	}
}
