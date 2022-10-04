package Ver02;

import java.util.Scanner;

//	1. SmartPhone 클래스를 정의합니다. 이 클래스는 연락처 정보를 관리하는 클래스입니다. 
public class SmartPhone {

//	① SmartPhone 클래스의 인스턴스를 생성합니다.
	private Contact[] contacts;
	private int numofContact;
	Scanner sc;
	
//	② 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
	private SmartPhone(int size) {
		contacts = new Contact[size];
		numofContact = 0;
		sc = new Scanner(System.in);
	}
	
//	③ 10번 반복해서 배열에 추가합니다.
	public static SmartPhone sp = new SmartPhone(10);
	
	public static SmartPhone getInstance() {
		if(sp==null) {
			sp = new SmartPhone(10);
		}
		return sp;
	}
	
//	② 배열에 인스턴스를 저장하고
	void insertContact() {
		
		if(numofContact>contacts.length) {
			System.out.println("최대저장가능 개수는 " + contacts + "개 입니다.");
			return;
		}
		
		String name = null;
		String number = null;
		String email = null;
		String address = null;
		String birth = null;	
		String group = null;
		
		System.out.println("입력을 시작합니다.");
		
		System.out.print("이름 > ");
		name = sc.nextLine();
		
		System.out.print("번호 > ");
		number = sc.nextLine();
		
		System.out.print("이메일 > ");
		email = sc.nextLine();
		
		System.out.print("주소 > ");
		address = sc.nextLine();
		
		System.out.print("생일 > ");
		birth = sc.nextLine();
		
		System.out.print("그룹 > ");
		group = sc.nextLine();
		
		Contact all = new Contact(name, number, email, address, birth, group);
		
		contacts[numofContact++] = all;
	}
	
//	④ 배열의 저장된 데이터의 리스트를 출력
	void printAllDate() {
		System.out.println("전체 데이터 =======================");
		
		for(int i=0; i<numofContact; i++) {
			contacts[i].printData();
		}
		if(numofContact==0) {
			System.out.println("저장된 데이터가 없습니다.");
			return;
		}
	}
	
//	⑤ 배열의 모든 요소를 검색
	void serchInfoPrint() {
		
		String name = null;
		Contact contact = null;
		
		System.out.println("검색을 시작합니다.");
		System.out.println("검색하실 이름을 적어주세요 >> ");
		name = sc.nextLine();
		
		for(int i=0; i<numofContact; i++) {
			if(contacts[i].getName().equals(name)) {
				contact = contacts[i];
				break;
			}
		}
		
		System.out.println("검색결과 ==================================");
		if(contact==null) {
			System.out.println("검색하신 " + name + "의 결과가 없습니다.");
		} else {
			contact.printData();
		}
	}

//	⑥ 배열의 요소를 삭제
	void deleteCotact() {
		
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제하려는 이름을 입력해주세요 >");
		String name = sc.nextLine();
		
		int searchIndex = -1;
		
		for(int i=0; i<numofContact; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		
		if(searchIndex<0) {
			System.out.println("삭제하고자 하는 이름의 데이터가 없습니다.");
		} else {
			for(int i=searchIndex; i<numofContact; i++) {
				contacts[i] = contacts[i+1];
			}
			numofContact--;
			System.out.println("데이터가 삭제됐습니다.");
		}		
	}
	
//	⑦ 배열의 요소를 수정	
	void editContact() {
		
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제하려는 이름을 입력해주세요 >");
		String name = sc.nextLine();
		
		int searchIndex = -1;
		
		for(int i=0; i<numofContact; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		
		if(searchIndex<0) {
			System.out.println("찾으려는 데이터가 없습니다.");
			return;
		}
		
		Contact contact = contacts[searchIndex];
		
		System.out.println("데이터 수정을 진행합니다.");
		
		System.out.println(
				"변경하고자 하는 이름을 입력해주세요.(현재값: " + contact.getName() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newName = sc.nextLine();
		
		// "	abc		" -> "abc"
		// " "
		if(newName != null && newName.trim().length()>0) {
			contact.setName(newName);
		}
		
		System.out.println(
				"변경하고자 하는 전화번호를 입력해주세요.(현재값: " + contact.getNumber() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newNumber = sc.nextLine();
		if(newNumber != null && newNumber.trim().length()>0) {
			contact.setNumber(newNumber);
		}
		System.out.println(
				"변경하고자 하는 이메일을 입력해주세요.(현재값: " + contact.getEmail() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newEmail = sc.nextLine();
		if(newEmail != null && newEmail.trim().length()>0) {
			contact.setEmail(newEmail);
		}
		System.out.println(
				"변경하고자 하는 주소를 입력해주세요.(현재값: " + contact.getAddress() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newAddress = sc.nextLine();
		if(newAddress != null && newAddress.trim().length()>0) {
			contact.setAddress(newAddress);
		}
		System.out.println(
				"변경하고자 하는 생일을 입력해주세요.(현재값: " + contact.getBirth() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newBirth = sc.nextLine();
		if(newBirth != null && newBirth.trim().length()>0) {
			contact.setBirth(newBirth);
		}
		System.out.println(
				"변경하고자 하는 그룹을 입력해주세요.(현재값: " + contact.getGroup() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newGroup = sc.nextLine();
		if(newGroup != null && newGroup.trim().length()>0) {
			contact.setGroup(newGroup);
		}
		
		System.out.println("정보가 수정되었습니다.");
		System.out.println();	
	}
	
}
	
	

