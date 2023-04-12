package sparta_Java.l_collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// ArrayList
		List<Integer> integerList = new ArrayList<>();

		// 삽입
		integerList.add(1);
		integerList.add(5);
		integerList.add(4);
		integerList.add(4);
		integerList.add(11);
		integerList.add(10);

		System.out.println(integerList + "\n");

		// 오름차순 정렬
		Collections.sort(integerList);
		System.out.println(integerList);
		System.out.println(integerList.size() + "\n");

		// 삭제
		integerList.remove(4);
		System.out.println(integerList);

		// 순서대로 출력 (for문) + 길이 확인
		for (int i = 0; i < integerList.size(); i++) {
			System.out.println(integerList.get(i));
		}
		System.out.println();

		// 순서대로 출력 (forEach문)
		for (int current : integerList) {
			System.out.println(current);
		}

	}

}
