package sparta_Java.o_collection_Stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		// 삽입
		stack.push(1);
		stack.push(3);
		stack.push(7);
		stack.push(5);
		System.out.println(stack + "\n");

		// 최우선 출력값 출력
		System.out.println(stack.peek());
		System.out.println(stack + "\n");

		// 최우선 출력값 출력 + 삭제
		System.out.println(stack.pop());
		System.out.println(stack + "\n");

		System.out.println("1 존재하나? : " + stack.contains(1));
		System.out.println("stack이 비어있나? : " + stack.empty() + "\n");

		// 스택 비우기
		stack.clear();
		System.out.println(stack);
		System.out.println(stack.isEmpty());

	}

}
