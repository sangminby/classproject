package Chapter06;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		int[] numbers = {2, 6, 14, 90, 40};
		
		for(int num : numbers) {
			System.out.println(num + "\t");
		}
		
		int[][] scores = {
				{100, 90, 60},
				{40, 100, 90}
		};
		
		for(int[] temp : scores) {
			
			for(int num : temp) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}

	}

}
