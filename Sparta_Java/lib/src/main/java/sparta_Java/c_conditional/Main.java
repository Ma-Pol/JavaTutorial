package sparta_Java.c_conditional;

public class Main {

	public static void main(String[] args) {

		// if, if~else문
		int check = 100;
		int num1 = 150;

		if (num1 > 100) {
			System.out.println("100보다 큰 수 입니다.");
		} else if (num1 > 50) {
			System.out.println("50보다 큰 수 입니다. 100보다 작거나 같습니다.");
		}


		// switch문
		char score = 'A';

		switch (score) {

			case 'A':
				System.out.println("A등급 축하합니다");
				break;

			case 'B':
				System.out.println("B등급");
				break;

			case 'C':
				System.out.println("C등급");
				break;

			default:
				System.out.println("C보다 낮습니다");
				break;

		}


		// 삼항 연산자
		int a = 5;
		String result = (a < 10) ? "10보다 작습니다" : "10보다 큽니다";
		System.out.println(result);

	}

}