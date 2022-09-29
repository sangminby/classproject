package Chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}
	
	public static void main(String[] args) {
		
		MyInterfaceImpl<String, Integer> myclass = new MyInterfaceImpl<String, Integer>();
		
		System.out.println(myclass.method1("Ten"));
		System.out.println(myclass.method2(10));
		
	}
}
