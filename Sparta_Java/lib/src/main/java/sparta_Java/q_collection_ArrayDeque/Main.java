package sparta_Java.q_collection_ArrayDeque;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {

		// ArrayDeque: Front, Rear 양 쪽에서 입, 출력이 이루어지는 자료구조
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

		// 앞자리 삽입(큐의 크기 문제가 발생하면 Exception 발생)
		arrayDeque.addFirst(1);
		arrayDeque.addFirst(2);
		arrayDeque.addFirst(3);
		arrayDeque.addFirst(4);
		System.out.println(arrayDeque + "\n");

		// 뒷자리 삽입(큐의 크기 문제가 발생하면 Exception 발생)
		arrayDeque.addLast(5);
		arrayDeque.addLast(6);
		System.out.println(arrayDeque + "\n");


		// 앞자리 삽입(큐의 크기 문제가 발생하면 false 리턴)
		arrayDeque.offerFirst(10);
		System.out.println(arrayDeque + "\n");

		// 뒷자리 삽입(큐의 크기 문제가 발생하면 false 리턴)
		arrayDeque.offerLast(-1);
		System.out.println(arrayDeque + "\n");


		// 앞자리 삽입
		arrayDeque.push(22);
		System.out.println(arrayDeque + "\n");

		// 앞자리 출력 + 삭제
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque + "\n");


		// 앞자리 출력 + 삭제
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque + "\n");

		// 뒷자리 출력 + 삭제
		System.out.println(arrayDeque.pollLast());
		System.out.println(arrayDeque + "\n");


		// 앞자리 출력
		System.out.println(arrayDeque.peekFirst());
		System.out.println(arrayDeque + "\n");

		// 뒷자리 출력
		System.out.println(arrayDeque.peekLast());
		System.out.println(arrayDeque + "\n");


		// 길이
		System.out.println(arrayDeque.size());

		// 전체 삭제
		arrayDeque.clear();
		System.out.println(arrayDeque + "\n");

		// 비어있나 체크
		System.out.println("arrayDeque 비어있나? : " + arrayDeque.isEmpty());

	}

}
