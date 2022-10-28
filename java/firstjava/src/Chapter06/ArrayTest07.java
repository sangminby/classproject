package Chapter06;

public class ArrayTest07 {

	public static void main(String[] args) {
		
		// Math.random() : 반환 타입 double
		// 0.0 <= Math.random() < 1
		// 0~9
		// 		0.0 * 10 <= Math.random() * 10 < 1 * 10
		// 		0.0 <= Math.random() * 10 < 10
		//		0.0 <= r <= 9.99999999
		// 		0.0 <= (int)(Math.random() * 10) < 1 * 10
		//		0.0 <= r <= 9
		System.out.println(Math.random());
		System.out.println((int)(Math.random() * 10));
		
		String[] player = {
				"손흥민", "박지성", "차두리", "안정환", "차범근"
		};
		
		// 0번지의 값과 1번지 값을 치환
		
		for(int i=0; i<10000; i++) {
	
		// 1~4
		// 0 <= <= 3
		// 1 <= <= 4
		int randomIdex = (int)(Math.random()*4) + 1;
		
		String temp = null;
		temp = player[0];
		player[0] = player[randomIdex];
		player[randomIdex] = temp;
		
//		System.out.println(player[0]);
//		System.out.println(player[1]);
		
		} for(String name : player) {
			System.out.println(name);
		}
		
		// index : 0~4
		int index = (int)(Math.random()*5);
		String pickName = player[index];
		System.out.println(pickName);
		
	}
}
