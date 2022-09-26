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
	
	// 배열에 인스턴스를 저장하고,
	// 1. 데이터 받고
	// 2. 인스턴스 생성
	// 3. 배열에 인스턴스 참조값을 저장
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
	
	// 전체 입력 데이터의 출력
	void all() {
		
		if(num==0) {
			System.out.println("입력정보없음");
			return;
		}
		for(int i=0; i<num; i++) {
			con[i].print();
		}
	}
	
	// 검색 후 결과 출력 ( 이름으로 검색 )
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
	
	// 삭제 ( 이름으로 검색 )
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
	
	// 이름 검색 후 데이터 수정
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
	
		Contact cont = con[index];
		
		System.out.println("데이터 수정을 진행합니다.");
		
		
		System.out.println(
				"변경하고자 하는 이름을 입력해주세요.(현재값: " + cont.getName() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String nName = s.nextLine();
		
		if(nName != null && nName.trim().length()>0) {
			cont.setName(nName);
		}
		
		
		System.out.println(
				"변경하고자 하는 전화번호를 입력해주세요.(현재값: " + cont.getNumber() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String nNumber = s.nextLine();
		if(nNumber != null && nNumber.trim().length()>0) {
			cont.setNumber(nNumber);
		}
		
		System.out.println(
				"변경하고자 하는 이메일을 입력해주세요.(현재값: " + cont.getEmail() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newEmail = s.nextLine();
		if(newEmail != null && newEmail.trim().length()>0) {
			cont.setEmail(newEmail);
		}
	
	
	
	
	}
}
