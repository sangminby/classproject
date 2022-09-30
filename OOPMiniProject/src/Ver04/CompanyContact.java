package Ver04;

public class CompanyContact extends Contact {

//	① CompanyContact 
//	회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//	- 회사이름, 부서이름, 직급 변수 추가
//	- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력

	private String company;
	private String division;
	private String manager;
	
	
	public CompanyContact(String name, String number, String email, String address, String birthday, String group) {
		super(name, number, email, address, birthday, group);
	}


	public CompanyContact(
			String name, String number, String email, 
			String address, String birthday, String group,
			String company, String division, String manager) {
		super(name, number, email, address, birthday, group);
		
		this.company = company;
		this.division = division;
		this.manager = manager;
	}


	@Override
	public void printData() {
		super.printData();
		System.out.println("회사이름 : " + this.company);
		System.out.println("부서이름 : " + this.division);
		System.out.println("직급 : " + this.manager);
	}
	
	
	public String getCompany() {
		return company;
	}
	public String getDivision() {
		return division;
	}
	public String getManager() {
		return manager;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}


	public static void main(String[] args) {
		
		Contact contact = new CompanyContact(
				"Son", "010-2323-5656", "son@gmail", 
				"London", "2000-10-12", "직장동료",
				"토트넘", "선수", "없음");
		
		contact.printData();
		
	}


	@Override
	public void ShowData() {
		// TODO Auto-generated method stub
		
	}
	
}