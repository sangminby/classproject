package SoloTest;

public class Chapter06TestMain {

	public static void main(String[] args) {
		
		// Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다
		Chapter06Test[] ch = new Chapter06Test[10];
		
		// Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		for(int a=0; a<ch.length; a++) {
			ch[a] = new Chapter06Test(
					"사람"+a,
					(int)(Math.random()*101),
					(int)(Math.random()*101),
					(int)(Math.random()*101),
					(int)(Math.random()*101)
					);
		}
			System.out.println("시험결과");
			System.out.println("-------------------------------------------------");
			System.out.println("이름\t국어\t영어\t수학\t과학\t합\t평균");
			System.out.println("-------------------------------------------------");
			
			int kor = 0;
			int eng = 0;
			int mat = 0;
			int sci = 0;
			
			// 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
			for(Chapter06Test c : ch) {
				c.Date();
				kor += c.getKor();
				eng += c.getEng();
				mat += c.getMat();
				sci += c.getSci();
		}
			System.out.printf("총점\t%d\t%d\t%d\t%d\n", kor, eng, mat, sci);
			System.out.printf("평균\t%.1f\t%.1f\t%.1f\t%.1f", kor/10f, eng/10f, mat/10f, sci/10f);
	}

}
