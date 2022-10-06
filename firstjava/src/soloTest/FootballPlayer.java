package soloTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FootballPlayer implements Comparable<FootballPlayer>{

	private String name;
	private int number;
	private String team;
	private int age;
	
	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getTeam() {
		return team;
	}
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(FootballPlayer f) {
		
		int result = team.compareTo(f.getTeam());		
		
		if(result==0) {
			result = name.compareTo(f.getName());	
			
			if (result==0) {
			result = number - f.getNumber();
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean b = false;
		
		if(obj!=null && obj instanceof FootballPlayer) {
			
			FootballPlayer play = (FootballPlayer)obj;
			
			b = team.equals(play.getTeam()) && name.equals(play.getName()) && age==(play.getAge());
		}
		return b;
	}

	@Override
	public String toString() {
		return "FootballPlayer [이름: " + name + ", 등번호: " + number + ", 팀명: " + team + ", 나이: " + age + "]";
	}

	
	public static void main(String[] args) {
		
//		1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		
		List<FootballPlayer> listL = new ArrayList<>();
		
		FootballPlayer player = new FootballPlayer("손흥민",7,"토트넘",20);
		listL.add(player);
		
		listL.add(new FootballPlayer("이강인",10,"바르셀로나",18));
		listL.add(new FootballPlayer("박지성",7,"맨유",30));
		listL.add(new FootballPlayer("손흥민",10,"맨유",15));
		listL.add(new FootballPlayer("홍명보",3,"코리아",35));
		listL.add(new FootballPlayer("박지성",10,"토트넘",20));
		
		System.out.println("선수 리스트 ========================");
		for(FootballPlayer f : listL) {
			System.out.println(f);
		}
		
//		2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 
//		입력이 되지 않도록 Set<E> 컬렉션을 이용해서 
//		축구선수 	인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		
		Set<FootballPlayer> listS = new HashSet<>();
		
		listS.add(new FootballPlayer("손흥민",7,"토트넘",20));
		listS.add(new FootballPlayer("이강인",10,"바르셀로나",18));
		listS.add(new FootballPlayer("박지성",7,"맨유",30));
		listS.add(new FootballPlayer("손흥민",7,"토트넘",20));
		listS.add(new FootballPlayer("홍명보",3,"코리아",35));
		listS.add(new FootballPlayer("박지성",7,"맨유",30));
		
		System.out.println();
		System.out.println("중복없는 선수 리스트 ========================");
		for(FootballPlayer S : listS) {
			System.out.println(S);
		}
		
//		3. TreeSet<E>을 이용해서 
//		팀 이름순으로 정렬하고, 
//		같은 팀의 선수들은 이름 순으로 정렬하고, 
//		같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다. 
		
		TreeSet<FootballPlayer> listTS = new TreeSet<>();
		
		listTS.add(new FootballPlayer("손흥민",7,"토트넘",20));
		listTS.add(new FootballPlayer("이강인",10,"바르셀로나",18));
		listTS.add(new FootballPlayer("박지성",7,"토트넘",30));
		listTS.add(new FootballPlayer("손흥민",10,"토트넘",15));
		listTS.add(new FootballPlayer("홍명보",3,"코리아",35));
		listTS.add(new FootballPlayer("박지성",10,"토트넘",20));
		
		// 팀이름 -> 같은팀 선수 이름순 -> 같은 팀, 이름, 번호
		
		System.out.println();
		System.out.println("순서대로 정렬한 선수 리스트 ========================");
		for(FootballPlayer T : listTS) {
			System.out.println(T);
		}
		
//		4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 
//		Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.
		
		Map<Integer, FootballPlayer> listM = new HashMap<>();
		
		listM.put(1,new FootballPlayer("손흥민",1,"토트넘",20));
		listM.put(2,new FootballPlayer("이강인",2,"바르셀로나",18));
		listM.put(3,new FootballPlayer("박지성",3,"토트넘",30));
		listM.put(4,new FootballPlayer("손흥민",4,"토트넘",15));
		listM.put(5,new FootballPlayer("홍명보",5,"코리아",35));
		listM.put(6,new FootballPlayer("박지성",6,"토트넘",20));
		
		System.out.println();
		System.out.println("선수번호로 찾기 ================================");
		System.out.println(listM.get(1));
	}
	
}
