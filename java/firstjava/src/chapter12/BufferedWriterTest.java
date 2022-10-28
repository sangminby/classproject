package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
		
//		BufferedWriter out = null;
		
		try(BufferedWriter out = new BufferedWriter(new FileWriter("c:\\test\\text2.txt"))) {
//			out = new BufferedWriter(new FileWriter("c:\\test\\text2.txt"));
			
			out.write("홍차는 차잎 내부의 성분이 자체에 들어있는 효소에 산화되어");
			out.newLine();
			out.write("녹차나");
			out.newLine();
			out.write("보이차와 같이");
			out.newLine();
			out.newLine();
			out.write("나무위키 참조");
			
			System.out.println("작성 완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	
	}
}
