package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) {
		
		try {
			
			Socket socket = new Socket("localhost", 7777);
			
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			
			String str1 = "";
			String str2 = "";
			
			Scanner sc = new Scanner(System.in);
			
			dout.writeUTF("클라이언트 접속");
			dout.flush();
			
			while(true) {
				
//				str2 = din.readUTF();
//				System.out.println("server : " + str2);
				
				str1 = sc.nextLine();
				
				if(str1.equals("exit")) {
					break;
				}
				
				dout.writeUTF(str1);
				dout.flush();
				
				str2 = din.readUTF();
				System.out.println("server : " + str2);
			}
			
			dout.close();
			din.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
