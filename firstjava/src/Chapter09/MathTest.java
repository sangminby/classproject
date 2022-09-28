package Chapter09;

public class MathTest {

	public static void main(String[] args) {
		
		// PI
		System.out.println(Math.PI);
		
		
		// 난수 생성
		System.out.println(Math.random());
		// 1~45
		int num = (int)(Math.random()*45)+1;		// 0~44
		System.out.println(num);
		
		
		// 소수점 한자리 이외 절사
		System.out.println(Math.floor(3.6002));
		
		
		// 반올림
		System.out.println(Math.round(3.6002));
		
		
		// 두 수 중 큰값 max  작은값 min
		System.out.println(Math.max(20, 10));
		System.out.println(Math.min(20, 10));
		
	}
}
