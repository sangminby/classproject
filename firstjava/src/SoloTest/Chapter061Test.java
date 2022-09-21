package SoloTest;

public class Chapter061Test {

	// 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
	// 변수는 캡슐화를 합니다.
	private String name; // 학생이름
	private int ko; // 국어점수
	private int en; // 영어점수
	private int ma; // 수학점수
	
	public Chapter061Test(String name, int ko, int en, int ma) {
		this.name = name;
		this.ko = ko;
		this.en = en;
		this.ma = ma;
	}

	// getter
	public String getName() { return name; }
	public int getKo() { return ko; }
	public int getEn() { return en; }
	public int getMa() { return ma; }
	// setter 메소드를 정의합니다.
	public void setName(String name) { this.name = name; }
	public void setKo(int ko) { this.ko = ko; }
	public void setEn(int en) { this.en = en; }
	public void setMa(int ma) { this.ma = ma;}
	
	// 총점과
	public int sum() {
		int result = 0;
		result = this.ko + this.en + this.ma;
		return result;
	}
	
	// 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	public float ave() {
		return sum()/3f;
	}
	
	public void Data() {
		System.out.println(
				this.name + "\t" +
				this.ko + "점" + "\t" +
				this.en + "점" + "\t" +
				this.ma + "점" + "\t" +  
				sum() + "점" + "\t" +
				String.format("%.1f", ave() )+"점" + "\n"
			);	
		}
	
	public static void main(String[] args) {
		
		Chapter061Test c = new Chapter061Test("학생", 100, 98, 80);
		
		c.Data();
		
	}
}
