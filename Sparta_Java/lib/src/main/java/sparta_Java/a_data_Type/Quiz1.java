package sparta_Java.a_data_Type;

public class Quiz1 {
	public static void main(String[] args) {

		// 1번: 값이 S인 문자 변수와 10인 정수 변수를 선언하고 출력
		char a = 'S';
		int b = 10;
		System.out.println(a);
		System.out.println(b);

		// 2번: 크기가 3인 정수형 배열을 선언
		// 		10, 20, 30 할당
		// 		length를 사용해 30을 출력
		int[] c = { 10, 20, 30 };
		System.out.println(c[c.length - 1]);

	}
}
