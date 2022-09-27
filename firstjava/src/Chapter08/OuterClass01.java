package Chapter08;

public class OuterClass01 {

	OuterClass01() {
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass {
		public void simpleMethod() {
			System.out.println("NestedClass Instance");
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass01.NestedClass nst1 = new OuterClass01.NestedClass();
		//nst1.simpleMethod();
		
		OuterClass01 o = new OuterClass01();
		
	}
}
