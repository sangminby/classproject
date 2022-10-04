package Ver05;

//② CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
public class CustomerContact extends Contact{

//	- 거래처회사이름, 거래품목, 직급 변수 추가
	private String company;
	private String product;
	private String manager;
	
	public CustomerContact(String name, String number, String email, String address, String birth, String group, String company, String product, String manager) {
		super(name, number, email, address, birth, group);	
		this.company = company;
		this.product = product;
		this.manager = manager;
	}

//	- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
	@Override
	public void printData() {
		super.printData();
		System.out.println("거래처: " + this.company);
		System.out.println("품목: " + this.product);
		System.out.println("직급: " + this.manager);
	}

	public String getCompany() {
		return company;
	}
	public String getProduct() {
		return product;
	}
	public String getManager() {
		return manager;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public void ShowData() {
		
	}
	
}
