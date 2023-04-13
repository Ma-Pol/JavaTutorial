package sparta_Java.r_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// 제네릭스: 컴파일 시의 타입 체크를 해주는 기능. 컴파일 안정성 향상
		List<String> list = new ArrayList();
		list.add("string");
		Collection<String> collection = list;

		List<Exception> exceptionList = new ArrayList<>();
		Collection<Exception> exceptionCollection = exceptionList;
//		exceptionCollection.addAll(list); // list의 제네릭스 타입은 Exception도 그 자식도 아니기 때문에 addAll 불가

		List<IllegalArgumentException> exceptions = new ArrayList<>();
		exceptionCollection.addAll(exceptions);

	}

}