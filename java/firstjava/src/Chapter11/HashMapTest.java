package Chapter11;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, SmartPhone> hashmap = new HashMap<>();
		
		hashmap.put("Spring", new SmartPhone("Spring", "010-1111-1111" ));
		hashmap.put("king", new SmartPhone("king", "010-2222-2222" ));
		
		System.out.println(hashmap.get("king"));
		
		hashmap.put("Son", new SmartPhone("Son", "010-3333-3333" ));
		hashmap.put("king", new SmartPhone("king", "010-7777-7777" ));
		
		System.out.println("=================================");
		
		System.out.println(hashmap.get("Son"));
		System.out.println(hashmap.get("son"));
		System.out.println(hashmap.get("king"));
		
		System.out.println("=================================");
		
		
		// 키 값들을 Set 객체로 받는다.
		Set<String> keySet = hashmap.keySet();
		
		for(String key : keySet) {
//			System.out.println(key);
			System.out.println(key + " = " + hashmap.get(key));
		}
	}

}
