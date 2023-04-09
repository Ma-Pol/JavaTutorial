package Sparta_Java;

public class Main {
	public static void main(String[] args) {

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

	}
}