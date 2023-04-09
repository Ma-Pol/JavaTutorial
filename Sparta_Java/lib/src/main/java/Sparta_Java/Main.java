package Sparta_Java;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// 참조 자료형: 기본 자료형이 아닌 모든 것. 객체를 가리키는 자료형.
		String sparta = "Hello Sparta!";
		System.out.println(sparta);

		int[] intArray = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(intArray) + "\n");

		// 배열
		int[] intEmptyArray = new int[5];
		intEmptyArray[1] = 4;
//		System.out.println(intEmptyArray);
		System.out.println(Arrays.toString(intEmptyArray));

		int[] intArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(intArray2));

		String[] stringEmptyArray = new String[5];
		stringEmptyArray[3] = "값1";
		System.out.println(Arrays.toString(stringEmptyArray));

		String[] stringArray = { "봄", "여름", "가을", "겨울" };
		System.out.println(Arrays.toString(stringArray));

		System.out.println(stringArray[stringArray.length - 1]);

	}
}