package SoloTest.Project;

import java.util.Scanner;

public class SmartPhone {

	private Contact[] con;
	private int num;
	private static SmartPhone pho = new SmartPhone(10);
	Scanner s = new Scanner(System.in);
	
	private SmartPhone(int a) {
		con = new Contact[a];
		num = 0;
	}
	
	public static SmartPhone get() {
		
		if(pho==null) {
			pho = new SmartPhone(10);
		}
		return pho;
	}
	
	void insert() {
		
		if(num>con.length) {
			System.out.println("최대개수: " + con);
			return;
		}
		
		String name = null;		
		String number = null;		
		String email = null;		
		String address = null;		
		String birthday = null;	
		String group = null;
	
		System.out.println("이름 >>");
		name = s.nextLine();
		System.out.println("번호 >>");
		number = s.nextLine();
		System.out.println("메일 >>");
		email = s.nextLine();
		System.out.println("주소 >>");
		address = s.nextLine();
		System.out.println("생일 >>");
		birthday = s.nextLine();
		System.out.println("그룹 >>");
		group = s.nextLine();
		
		Contact c = new Contact(name, number, email, address, birthday, group);
		
		con[num++] = c;
	}
	
	void all() {
		
		if(num==0) {
			System.out.println("입력정보없음");
			return;
		}
		for(int i=0; i<num; i++) {
			con[i].print();
		}
	}
	
	void serch() {
		
		String name = null;
		
		System.out.println("검색을 시작합니다.");
		System.out.println("===========================");
		System.out.println("검색할 이름을 입력하세요.");
		name = s.nextLine();
		
		Contact contact = null;
		
		for(int i=0; i<num; i++) {
			if(con[i].getName().equals(name)) {
				contact = con[i];
				break;
			}
		}
		
		System.out.println("검색결과======================");
		if(contact==null) {
			System.out.println("검색결과" + name + "이(가) 없습니다.");
		} else {
			contact.print();
		}
	}
	
	void del() {
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제할 이름을 적어주세요 >>");
		String name = s.nextLine();
		
		int index = -1;
		
		for(int i=0; i<num; i++) {
			if(con[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		
		if(index<0) {
			System.out.println("삭제할 데이터가 없습니다.");
		} else {
			for(int i=index; i<num-1; i++) {
				con[i] = con[i+1];
			}
			num--;
			System.out.println("데이터를 삭제했습니다.");
		}
		
	}
	
	void edit() {
		
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.println("수정하고자 하는 이름을 입력해주세요 >");
		String name = s.nextLine();
		
		
		int index = -1;   
		
		// 데이터 찾기
		for(int i=0; i<num; i++) {
			if(con[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		
		if(index<0) {
			System.out.println("찾으시는 데이터가 존재하지않습니다.");
			return;
		}
	
		
		
		
		
		
	}
	
	
	
	
	
}
