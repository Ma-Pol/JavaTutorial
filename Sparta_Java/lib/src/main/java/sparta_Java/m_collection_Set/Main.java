package sparta_Java.m_collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// HashSet
		Set<Integer> integerSet = new HashSet<>();

		// 삽입
		integerSet.add(1);
		integerSet.add(1);
		integerSet.add(3);
		integerSet.add(2);
		integerSet.add(9);
		integerSet.add(8);
		System.out.println(integerSet + "\n"); // 중복 비허용, 자동 정렬

		Set<String> stringSet = new HashSet<>();

		stringSet.add("LA");
		stringSet.add("New York");
		stringSet.add("LasVegas");
		stringSet.add("San Francisco");
		stringSet.add("Seoul");
		System.out.println(stringSet + "\n");

		// 삭제
		stringSet.remove("Seoul");
		System.out.println(stringSet + "\n");

		// 다중 삭제
		List<String> target = new ArrayList<>();
		target.add("New York");
		target.add("LasVegas");
		stringSet.removeAll(target);
		System.out.println(stringSet + "\n");

		// 존재 확인
		System.out.println("LA 포함되어 있나? : " + stringSet.contains("LA"));
		System.out.println("Seoul 포함되어 있나? : " + stringSet.contains("Seoul") + "\n");

		// 길이 확인
		System.out.println(stringSet.size() + "\n");

		// 전체 삭제(비우기)
		stringSet.clear();
		System.out.println(stringSet);
	}

}
