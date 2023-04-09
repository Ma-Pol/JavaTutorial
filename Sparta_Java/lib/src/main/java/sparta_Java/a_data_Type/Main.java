package sparta_Java.a_data_Type;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// 자료형
		int number = 5;
		System.out.println(number + "\n");

		String sparta = "Hello, Sparta!";
		System.out.println(sparta + "\n");

		String project = "나의 최애를 알아줘!\n";
		System.out.println(project);

		final int finalNumber = 1;
		System.out.println(finalNumber + "\n");

		sparta = "Good Bye Sparta..";
		System.out.println(sparta + "\n\n");



		// 자료형 - 기본 자료형
		//
		// byte: ASCII code
		byte data = '*';
		System.out.println(data);

		// byte: 1 byte 정수, -128 ~ 127
		byte a = 100;
		System.out.println(a);

		// short: 2 byte 정수, –32,768 ~ 32,767
		short b = 10000;
		System.out.println(b);

		// int: 4 byte 정수, –2,147,483,648 ~ 2,147,483,647
		int c = 1000000000;
		System.out.println(c);

		// long: 8 byte 정수, –9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		// 자바에서는 상수를 기본적으로 int형으로 받아들인다.
		// 따라서 상수를 long 형으로 표현하기 위해서는 반드시 숫자 뒤에 L을 붙여주자.
		long d = 1000000000000000000L;
		System.out.println(d);

		// float: 4 byte 실수, 3.4E–38 ~ 3.4E+38 (E숫자 = 10^숫자)
		// float 또한 반드시 숫자 뒤에 F를 붙여주자.
		float e = 5.5F;
		System.out.println(e);

		// double: 8 byte 실수, 1.7E-308 ~ 1.7E+308
		double f = 121687.1557;
		System.out.println(f + "\n\n");

		// 각 자료형의 최대/최소값 찾기
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE + "\n");
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE + "\n");
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE + "\n");
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE + "\n");
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE + "\n");
		System.out.println(Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

		// char: 문자
		char g = 'A';
		System.out.println(g);

		// boolean: 논리
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println(isTrue);
		System.out.println(isFalse);



		// 참조 자료형: 기본 자료형이 아닌 모든 것. 객체를 가리키는 자료형.
		String sparta2 = "Hello Sparta!";
		System.out.println(sparta2);

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
