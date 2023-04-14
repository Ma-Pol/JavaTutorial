package sparta_Java.s_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<String> listString = new ArrayList<>();
		listString.add("Korea");
		listString.add("Japan");
		listString.add("France");

		Stream<String> streamString = listString.stream();

		// 1. map함수: streamString list의 각 요소를 str에 담고, 그 str에 대해 각각 toUpperCase() 메서드를 수행
		// 2. forEach함수: map함수의 수행이 끝난 뒤, 변화한 streamString의 각 요소를 it에 담고, 그 it을 각각 출력
		// 자바스크립트의 화살표함수와 자바의 메서드가 합쳐진 느낌
		streamString.map(str -> {
			System.out.println(str);
			return str.toUpperCase();
		}).forEach(it -> System.out.println(it));
		//.forEach(System.out::println); // 다른 표현 방법

	}

}
