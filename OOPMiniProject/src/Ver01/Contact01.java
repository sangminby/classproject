package Ver01;

import java.util.Scanner;

public class Contact01 {
	
	// 연락처 데이터를 저장하는 인스턴스를 생성합니다.
	private String name; // 이름
	private String number; // 번호
	private String email; // 메일
	private String address; // 주소
	private String birthday; // 생일
	private String groups; // 그룹
	
	// 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.
	public String getName() { return name; }
	public String getNumber() { return number; }
	public String getEmail() { return email; }
	public String getAddress() { return address; }
	public String getBirthday() { return birthday; }
	public String getGroups() { return groups; }
	
	// 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다.
	public void setName(String name) { this.name = name; }
	public void setNumber(String number) { this.number = number; }
	public void setEmail(String email) { this.email = email; }
	public void setAddress(String address) { this.address = address; }
	public void setBirthday(String birthday) { this.birthday = birthday; }
	public void setGroups(String groups) { this.groups = groups; }
	
	// 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
	void showInfo() {
		
		System.out.println("저장완료"+ "\n");
		System.out.println("이름: " + name);
		System.out.println("번호: " + number);
		System.out.println("메일: " + email);
		System.out.println("주소: " + address);
		System.out.println("생일: " + birthday);
		System.out.println("그룹: " + groups);
	}
	
	// main()메소드를 정의합니다.
	public static void main(String[] args) {
	
		// 인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다
		Contact01 c1 = new Contact01();
		
		//인스턴스의 출력메소드를 다시 실행합니다.
		while (true) {
	
			Scanner in = new Scanner(System.in);
	
			System.out.println("저장정보" + "\n");
	
			System.out.println("이름을 입력해주세요.");
			c1.setName(in.nextLine());
			System.out.println("번호를 입력해주세요.");
			c1.setNumber(in.nextLine());
			System.out.println("메일을 입력해주세요.");
			c1.setEmail(in.nextLine());
			System.out.println("주소를 입력해주세요.");
			c1.setAddress(in.nextLine());
			System.out.println("생일을 입력해주세요.");
			c1.setBirthday(in.nextLine());
			System.out.println("그룹을 입력해주세요.");
			c1.setGroups(in.nextLine());
			
			System.out.println();
			
			c1.showInfo();
			
			System.out.println();
			
			System.out.println("저장을 계속하시려면 1, 그만하시려면 2 입력");
			int exit = in.nextInt();
			System.out.println();
					
			if(exit==2) {
				 break;
			}
			
		}
	}
}





	
