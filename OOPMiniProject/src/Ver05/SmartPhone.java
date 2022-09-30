package Ver05;

import java.util.Scanner;

public class SmartPhone {
	
	// 기능 클래스 : 속성을 가지지 않고 메소드들로만 정의된 클래스
	// 여러개의 인스턴스가 생성될 필요없다 -> 싱글톤 패턴
	// 1. private 생성자
	// 2. 클래스 내부에서 인스턴스를 생성 static private
	// 3. 내부에서 생성한 참조값을 반환 해주는 메소드 -> static public
	
	// 요구사항 
	// 이 클래스는 연락처 정보를 관리하는 클래스입니다.
	// ① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	// -> 10개 정보를 저장할 수 있다 -> 배열 인스턴스를 생성 Contact[]
	// Contact 클래스 기반의 인스턴스를 최대 10개까지 만들어서 배열에 참조값을 저장
	
	private Contact[] contacts;   // null;
	private int numofContact;   // 입력한 정보의 개수, 배열의 index 값으로 사용
	Scanner sc;
	
	private SmartPhone(int size) {
		contacts = new Contact[size];
		numofContact = 0;
		sc = new Scanner(System.in);
	}
	
	private static SmartPhone sp = new SmartPhone(10);
	
	public static SmartPhone getInstance() {
		if(sp==null) {
			sp = new SmartPhone(10);
		}
		return sp;
	}
	
	// 기능
	// ② 배열에 인스턴스를 저장하고, 
	//					수정하고, ( 이름으로 검색 )
	// 					삭제, ( 이름으로 검색 )
	//					검색 후 결과 출력, ( 이름으로 검색 )
	// 					저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
	
	
	// 이름을 입력받고 배열에 해당 이름의 Contact 객체가 있는 index 반환
	private	int getIndex() {
		
		String name = sc.nextLine();
		
		// 이름 검색하고자 하는 index 찾아야한다!
		int searchIndex = -1;   // 현재 검색의 결과는 없다!
		
		// 데이터 찾기
		for(int i=0; i<numofContact; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		} 
		return searchIndex;
	}
	
	
	// 이름 검색 후 데이터 수정
	void editContact() {
		
		// 검색어 받기
				System.out.println("데이터 수정이 진행됩니다.");
				System.out.println("수정하고자 하는 이름을 입력해주세요 >");
//				String name = sc.nextLine();
//				
//				// 삭제하고자 하는 index 찾아야한다! -> 시프트
//				int searchIndex = -1;   // 현재 검색의 결과는 없다!
//				
//				// 데이터 찾기
//				for(int i=0; i<numofContact; i++) {
//					if(contacts[i].getName().equals(name)) {
//						searchIndex = i;
//						break;
//					}
//				} 
				
				int searchIndex = getIndex();
				
				if(searchIndex<0) {
					System.out.println("찾으시는 데이터가 존재하지않습니다.");
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
						"변경하고자 하는 생일을 입력해주세요.(현재값: " + contact.getBirthday() + ")\n" 
								+ "변경하지 않으려면 엔터를 치세요 >");
				String newBirthday = sc.nextLine();
				if(newBirthday != null && newBirthday.trim().length()>0) {
					contact.setBirthday(newBirthday);
				}
				System.out.println(
						"변경하고자 하는 그룹을 입력해주세요.(현재값: " + contact.getGroup() + ")\n" 
								+ "변경하지 않으려면 엔터를 치세요 >");
				String newGroup = sc.nextLine();
				if(newGroup != null && newGroup.trim().length()>0) {
					contact.setGroup(newGroup);
				}
				
				if(contact instanceof CompanyContact) {
					
					CompanyContact companycontact = (CompanyContact)contact;
					
					System.out.println(
							"변경하고자 하는 회사이름을 입력해주세요.(현재값: " + companycontact.getCompany() + ")\n" 
									+ "변경하지 않으려면 엔터를 치세요 >");
					String newCompany = sc.nextLine();
					if(newCompany != null && newCompany.trim().length()>0) {
						companycontact.setCompany(newCompany);
					}
					System.out.println(
							"변경하고자 하는 부서이름을 입력해주세요.(현재값: " + companycontact.getDivision() + ")\n" 
									+ "변경하지 않으려면 엔터를 치세요 >");
					String newDivision = sc.nextLine();
					if(newDivision != null && newDivision.trim().length()>0) {
						companycontact.setDivision(newDivision);	
					}
					System.out.println(
							"변경하고자 하는 직급을 입력해주세요.(현재값: " + companycontact.getManager() + ")\n" 
									+ "변경하지 않으려면 엔터를 치세요 >");
					String newManager = sc.nextLine();
					if(newManager != null && newManager.trim().length()>0) {
						companycontact.setManager(newManager);	
					}
					
				} else if(contact instanceof CustomerContact) {
					
					CustomerContact customerContact = (CustomerContact)contact;
					
					System.out.println(
							"변경하고자 하는 거래처을 입력해주세요.(현재값: " + customerContact.getCompany() + ")\n" 
									+ "변경하지 않으려면 엔터를 치세요 >");
					String newCompany = sc.nextLine();
					if(newCompany != null && newCompany.trim().length()>0) {
						customerContact.setCompany(newCompany);
					}
					System.out.println(
							"변경하고자 하는 거래품목을 입력해주세요.(현재값: " + customerContact.getProduct() + ")\n" 
									+ "변경하지 않으려면 엔터를 치세요 >");
					String newProduct = sc.nextLine();
					if(newProduct != null && newProduct.trim().length()>0) {
						customerContact.setProduct(newProduct);
					}
					System.out.println(
							"변경하고자 하는 담당자를 입력해주세요.(현재값: " + customerContact.getManager() + ")\n" 
									+ "변경하지 않으려면 엔터를 치세요 >");
					String newManager = sc.nextLine();
					if(newManager != null && newManager.trim().length()>0) {
						customerContact.setManager(newManager);
					}
				} 
				
				System.out.println("정보가 수정되었습니다.");
				System.out.println();
				
	}
	
	// 삭제 ( 이름으로 검색 )
	void deleteContact() {
		
		// 검색어 받기
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제하고자 하는 이름을 입력해주세요 >");

		int searchIndex = getIndex();
		
		// 검색한 index 값으로 분기 : 시프트를 하거나 검색결과 이름이 존재하지 않는다.
		if(searchIndex<0) {
			System.out.println("삭제하고자 하는 이름의 데이터가 존재하지않습니다.");
		} else {
			for(int i=searchIndex; i<numofContact-1; i++) {
				contacts[i] = contacts[i+1];
			}
			
			numofContact--;
			System.out.println("데이터가 삭제되었습니다.");
			
		}
			
	}
	
	// 검색 후 결과 출력 ( 이름으로 검색 )
	void searchInfoPrint() {
		
		// 1. 사용자에게 검색할 키워드 입력받는다
		// 2. 배열에서 이름 검색
		// 3. 결과 출력 : "검색한 이름의 정보가 없습니다."
		String name = null;   // 검색할 이름
		
		int serchIndex = getIndex();
		
		// 3. 결과 출력 : "검색한 이름의 정보가 없습니다."
		System.out.println("검색의 결과 ----------------------");
		if(serchIndex < 0) {
			System.out.println("검색한 이름 " + name + "의 정보가 없습니다.");
		} else {
			contacts[serchIndex].printData();
		}
		
		
	}
	
	
	// 전체 입력 데이터의 출력
	void printAllData() {
		// 배열에 저장된 데이터를 모두 출력
		
		System.out.println("전체데이터 --------------------------");
		
		if(numofContact==0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		for(int i=0; i<numofContact; i++) {
			contacts[i].printData();
		}
	}
	
	void insertContact() {
		// 배열에 인스턴스를 저장하고,
		// 1. 데이터 받고
		// 2. 인스턴스 생성
		// 3. 배열에 인스턴스 참조값을 저장
		
		if(numofContact>contacts.length) {
			System.out.println("최대 저장 개수는 " + contacts + "개 입니다.");
			return;
		}
		
		// 회사 친구 입력 ?
		// 거래처 정보 입력
		
		
		System.out.println("입력하고자 하는 친구 타입을 선택해주세요.");
		System.out.println("1. 회사동료 \t 2. 거래처");
		int select = Integer.parseInt(sc.nextLine());
		
		
		String name = null;
		String phonenumber = null;
		String email = null;
		String address = null;
		String birthday = null;	
		String group = null;	
		
		System.out.println("입력을 시작합니다.");
		
		System.out.print("이름 > ");
		name = getName();
		
		System.out.print("전화번호 > ");
		phonenumber = getPhoneNumber();
		
		System.out.print("이메일 > ");
		email = getName();
		
		System.out.print("주소 > ");
		address = getName();
		
		System.out.print("생일 > ");
		birthday = getName();
		
		System.out.print("그룹 > ");
		group = getName();
	
		
		Contact contact = null;
		
		// 분기 1. 회사2. 거래처
		if(select == 1) {
			
			// CompanyContact 인스턴스 생성
			System.out.println("회사이름 >> ");
			String company = getString();
			System.out.println("부서이름 >> ");
			String division = getString();
			System.out.println("직급 >> ");
			String manager = getString();
			
			// 2. 인스턴스 생성
			contact = new CompanyContact(
					name, phonenumber, email, 
					address, birthday, group, 
					company, division, manager);
		} else {
			
			// CustomContact 인스턴스 생성
				System.out.println("거래처 이름 >> ");
				String company = getString();
				System.out.println("품목 >> ");
				String product = getString();
				System.out.println("담당자 >> ");
				String manager = getString();
			
				// 2. 인스턴스 생성
				contact = new CustomerContact(
						name, phonenumber, email, 
						address, birthday, group, 
						company, product, manager);
			
		}
		
		// 배열에 저장
		// 처음 입력 : numofContact -> 0
		contacts[numofContact++] = contact;
//		 numofContact++;
		
	}
	
	// Scanner 를 통해서 사용자에게 문자열을 받아서 반환하는 메소드
	// 입력 문자가 공백일 경우 다시 입력하도록 하는 기능
	private String getString() {
		
		String str = null;
		
		while(true) {
			str = sc.nextLine();
			if(str!=null && str.trim().length()!=0) {
				break;
			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력하세요!");
			}
		}
		return str;
	}
	
	// 이름정보를 받아서 중복 여부 체크 후 문자열 반환
	private String getName() {
		
		String name = null;
		
		while(true) {
			name = sc.nextLine();
			if(name!=null && name.trim().length()!=0) {
				// 배열요소에 같은이름의 요소가 있는지 체크
				boolean check = false;
				
				// 이름검색
				for(int i=0; i<numofContact; i++) {
					if(name.equals(contacts[i].getName())) {
						check = true;
						break;
					}
				}
				
				if(check) {
					System.out.println("같은 이름의 데이터가 존재합니다.\n다시 입력하세요 >> ");
					//continue;
				} else {
					break;
				}
			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력하세요!");
			}
		}
		return name;
	}
	
	// 전화번호를 받아서 중복된 전화번호가 있는지 체크 중복되지 않는 전화번호를 받아서 반환
	private String getPhoneNumber() {
		
		String phonenumber = null;
		
		while(true) {
			
			phonenumber = sc.nextLine();
			
			if(phonenumber != null && phonenumber.trim().length()>0) {
				
				boolean check = false;
				
				// 중복여부 체크
				for(int i=0; i<numofContact; i++) {
					if(phonenumber.equals(contacts[i].getNumber())) {
						check = true;
						break;
					}
				}
				
				if(check) {
					System.out.println("중복된 전화번호가 존재합니다\n다시 입력해주세요 >> ");
				} else {
					break;
				}
				
			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력하세요!");
			}
		}
		return phonenumber;
	}
	
}
