package Ver01;

public class Contact01 {
	
	// 연락처 데이터를 저장하는 인스턴스를 생성합니다.
	//	 이름
	private String name;
	//	 전화번호
	private String number;
	//	 이메일
	private String email;
	//	 주소
	private String address;
	//	 생일
	private String birthday;
	//	 그룹
	private String groups;
	
	// 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getGroups() {
		return groups;
	}
	
	
	// 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다.
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setGroups(String groups) {
		this.groups = groups;
	}
	
	
	// 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
	void showInfo() {
		
		System.out.println("저장정보"+ "\n");
		System.out.println("이름: " + name);
		System.out.println("번호: " + number);
		System.out.println("메일: " + email);
		System.out.println("주소: " + address);
		System.out.println("생일: " + birthday);
		System.out.println("그룹: " + groups);
		
	}
}



	
