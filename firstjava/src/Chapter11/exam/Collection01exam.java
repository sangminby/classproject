package Chapter11.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection01exam {
	
	void printAll(FootballPlayer fp) {
		fp.print(null, 0, null, 0);
	}
	
	public static void main(String[] args) {
	// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
	// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		FootballPlayer fp = new FootballPlayer();
		Scanner in = new Scanner(System.in);
			
		
		System.out.println("이름을 입력하세요.");
		list.add(fp.name);
		in.nextLine();
		
		System.out.println("번호를 입력하세요.");
		list1.add(fp.number);
		in.nextInt();
		
		System.out.println("팀명을 입력하세요.");
		list.add(fp.team);
		in.nextLine();
		
		System.out.println("나이를 입력하세요.");
		list1.add(fp.age);
		in.nextInt();

		printAll(list, list1);

	
	}
}

	class FootballPlayer {
		
		String name;
		int number;
		String team;
		int age;
		
		void print(String name, int number, String team, int age) {
			this.name = name;
			this.number = number;
			this.team = team;
			this.age = age;
		}
	}







