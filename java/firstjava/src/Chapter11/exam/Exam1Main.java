package Chapter11.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam1Main {

	public static void main(String[] args) {
		
		
//		1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
//		인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
		
		List<FootballPlayer> players = new ArrayList<>();
		
		
		// List<E> -> 저장 메소드 add(new FootballPlayer() )
		FootballPlayer player = new FootballPlayer("손흥민", 7, "토트넘", 20);
		players.add(player);
		
		players.add(new FootballPlayer("케인", 10, "토트넘", 25));
		players.add(new FootballPlayer("이강인", 25, "토트넘", 19));
		players.add(new FootballPlayer("박지성", 7, "맨유", 35));
		players.add(new FootballPlayer("루니", 10, "맨유", 35));
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
		
		
		// List<E> : 저장 순서를 유지 -> index 값을 가지고, 일괄처리
		// 나의 선수 리스트
		System.out.println("나의 선수 리스트============\n");
		for(FootballPlayer p : players) {
			System.out.println(p);
		}
	}

}
