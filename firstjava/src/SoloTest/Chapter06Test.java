package SoloTest;

public class Chapter06Test {

	// 학생이름, 국어점수, 영어점수, 수학점수, 과학점수를 저장하는 변수를 정의 합니다.
	// 변수는 캡슐화를 합니다.
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sci;

	public Chapter06Test(String name, int kor, int eng, int mat, int sci) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
	}

	// getter/setter 메소드를 정의합니다.
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public int getSci() {
		return sci;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}

	// 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	public int sum() {
		int result = 0;
		result = kor + eng + mat + sci;
		return result;
	}
	
	public float ave() {
		return sum()/4f;
	}

	public void Date() {
		System.out.println(
				this.name + "\t" + 
				this.kor + "\t" + 
				this.eng + "\t" +
				this.mat + "\t" +
				this.sci + "\t" +
				sum() + "\t" +
				ave() + "\n");
	}
	
	// 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	public static void main(String[] args) {
		
		Chapter06Test c = new Chapter06Test("사람 1", 100, 63, 20, 70);
		
		System.out.println("합: " + c.sum());
		System.out.println("평균: " + c.ave());
		
		c.Date();
		
	}
}
