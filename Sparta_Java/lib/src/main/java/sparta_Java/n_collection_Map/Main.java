package sparta_Java.n_collection_Map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// HashMap
		Map<Integer, String> map = new HashMap<>();

		// 삽입
		map.put(1, "apple");
		map.put(5, "carret");
		map.put(2, "berry");
		map.put(6, "cherry");
		System.out.println(map + "\n");

		// 검색(key)
		System.out.println("1st in map: " + map.get(5) + "\n");

		// 삭제
		map.remove(5);
		System.out.println(map + "\n");

		// 존재 확인
		System.out.println("2번 키 존재하나? : " + map.containsKey(2));
		System.out.println("5번 키 존재하나? : " + map.containsKey(5));
		System.out.println("apple 값 존재하나? : " + map.containsValue("apple"));
		System.out.println("carret 값 존재하나? " + map.containsValue("carret") + "\n");

		// 전체 삭제
		map.clear();
		System.out.println(map);

	}

}
