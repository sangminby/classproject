package Ver01;

// Contact 클래스의 용도 ? -> 데이터 저장
// 인스턴스 생성 -> 변수의 메모리 생성 -> 데이터 저장
public class Contact {
	
	/*	저장 정보
 		이름
 		전화번호
 		이메일
 		주소
 		생일
 		그룹
			* 변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다.
	 */
	private String name;		// 친구의 이름
	private String number;		// 번호
	private String email;		// 메일
	private String address;		// 주소
	private String birthday;	// 생일
	private String group;		// 그룹
	
	
	public Contact(String name, String number, String email, String address, String birthday, String group) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
	
	
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
	public String getGroup() {
		return group;
	}
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
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	// 위 데이터를 출력하는 기능
	public void printData() {
		System.out.println("이름: " + this.name);
		System.out.println("번호: " + this.number);
		System.out.println("메일: " + this.email);
		System.out.println("주소: " + this.address);
		System.out.println("생일: " + this.birthday);
		System.out.println("그룹: " + this.group);
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}
	
}
