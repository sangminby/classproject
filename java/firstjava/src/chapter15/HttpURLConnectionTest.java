package chapter15;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionTest {

	public static void main(String[] args) {
		
		String urlstr = "https://www.google.com";
		
		try {
			
			URL url = new URL(urlstr);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			for(int i=1; i<=8; i++) {
				System.out.println(connection.getHeaderFieldKey(i) + " = " + connection.getHeaderField(i));
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}