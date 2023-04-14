package sparta_Java.t_stream;

import java.util.Arrays;
import java.util.List;

public class Quiz1 {

	public static void main(String[] args) {

		// stream을 활용해 이씨 성을 가진 사람의 수를 세기
		List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");

		System.out.println("이씨 성을 가진 사람의 수: "
				+ names.stream().map(name -> name.substring(0, 1)).filter(name -> name.equals("이")).count());

		// 다른 답안
		System.out.println("이씨 성을 가진 사람의 수: " + names.stream().filter(name -> name.startsWith("이")).count());

	}

}