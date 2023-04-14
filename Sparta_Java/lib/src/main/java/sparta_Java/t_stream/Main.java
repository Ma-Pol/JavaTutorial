package sparta_Java.t_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.tuple.Pair;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("korea");
		list.add("japan");
		list.add("france");

		// Stream: 데이터의 흐름
		// 컬렉션 객체의 뒤에 .stream()을 붙임으로서 Stream 객체를 생성
		Stream<String> stream = list.stream();

		// stream 객체 작동 원리: 컬렉션의 요소를 하나씩 꺼내서 뒤에 붙는 연산을 수행
		stream.map(string -> {
			System.out.println(string);
			return string.toUpperCase();
		}).forEach(System.out::println);
		// stream 객체가 void를 return하면 더 이상 해당 stream 객체는 사용할 수 없게 된다.
		// ex) 이 아래로는 stream 스트림 객체를 사용할 수 없다.

		// stream의 특징: 기존 컬렉션 데이터를 건드리지 않는다.
		System.out.println("\n" + list + "\n\n\n\n\n");





		List<String> list2 = new ArrayList<>();
		list2.add("서울");
		list2.add("부산");
		list2.add("대구");
		list2.add("서울");
		list2.add("포항");
		System.out.println(list2);

		// list2 리스트에서 총 2개의 값만을 뽑아온다.
		// List의 형식으로 stream에서 출력된 값을 모은다.
		List<String> result = list2.stream()
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(result);

		System.out.println("\nlist2 -> treansformation -> set");
		Set<String> setResult = list2.stream()
				.filter(str -> "서울".equals(str))
			//  .filter("서울"::equals) // 다른 표현 방법
				.collect(Collectors.toSet());
		System.out.println(setResult + "\n\n\n\n\n"); // set은 중복을 허용하지 않으므로 하나의 서울만 출력





		String[] arr = {"SQL", "Java", "Python"};
		Stream<String> stringStream = Arrays.stream(arr);
		stringStream.forEach(System.out::println);
		System.out.println("\n\n\n\n");





		List<Sale> sales = Arrays.asList(
				new Sale("Apple", 5000, 0.05f),
				new Sale("Orange", 4000, 0.2f),
				new Sale("Grape", 2000, 0)
		);

		sales.stream()
			.map(sale -> Pair.of(sale.fruitName, sale.price * (1 - sale.discount)))
			.forEach(result2 -> System.out.println(result2.getLeft() + "\t실 구매가: " + result2.getRight() + "원 입니다."));
			// result2.getLeft(): sale.fruitName
			// result2.getRight(): sale.price * (1 - sale.discount))
		System.out.println("\n\n\n\n");





		List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// int start = 0으로 시작, list4의 각 값(data)으로 start += data 수행
		System.out.println(list4.stream().reduce(0, Integer::sum));

	}

}

class Sale {

	String fruitName;
	int price;
	float discount;

	public Sale(String fruitName, int price, float discount) {
		this.fruitName = fruitName;
		this.price = price;
		this.discount = discount;
	}

}
