package Chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// StringBuffer, StringBuilder
		
		StringBuffer sb = new StringBuffer("Hello");	// 6+16 저장공간
		
		System.out.println(sb);
		
		
		// 문자열 붙이기
		sb.append("~");
		sb.append(false);
		
		System.out.println(sb);
		
		
		// 특정 문자열 삭제
		System.out.println();
		System.out.println(sb.delete(0, 1));
		
		
		// 특정위치에 문자열 삽입
		System.out.println();
		System.out.println(sb.insert(6, "~"));
		System.out.println(sb.insert(sb.length(), true));
		
		
		// 문자열을 역순으로 변경
		System.out.println();
		System.out.println(sb.reverse());

	}
}
