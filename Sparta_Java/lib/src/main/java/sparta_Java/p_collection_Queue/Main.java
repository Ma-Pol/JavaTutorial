package sparta_Java.p_collection_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		// 삽입
		queue.add(1);
		queue.add(3);
		queue.add(7);
		queue.add(5);
		System.out.println(queue + "\n");

		// 최우선 출력값 출력
		System.out.println(queue.peek());
		System.out.println(queue + "\n");

		// 최우선 출력값 출력 + 삭제
		System.out.println(queue.poll());
		System.out.println(queue + "\n");

		// 이하 stack과 동일

	}

}
