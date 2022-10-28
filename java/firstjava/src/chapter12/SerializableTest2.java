package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableTest2 {

	public static void main(String[] args) {
		
		String msg = "안녕하세요123";
		
		ObjectInputStream inputStream = null;
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream("instanceData.ser"));
			
			String str = (String) inputStream.readObject();
			
			Person p = (Person) inputStream.readObject();
			
			System.out.println(str);
			
			p.tell();
			
			ArrayList<Person> list = (ArrayList<Person>) inputStream.readObject();
			
			for(Person person : list) {
				person.tell();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
