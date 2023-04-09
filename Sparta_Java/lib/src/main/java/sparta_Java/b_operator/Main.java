package sparta_Java.b_operator;

public class Main {

	public static void main(String[] args) {

		// 산술 연산자
		int num1 = 10;
		int num2 = 5;
		int num3 = 10;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3 + "\n");

		int result1 = num1 + num2;
		System.out.println("num1 + num2 = " + result1);

		result1 = num1 - num2;
		System.out.println("num1 - num2 = " + result1);

		result1 = num1 * num2;
		System.out.println("num1 * num2 = " + result1);

		result1 = num1 / num2;
		System.out.println("num1 / num2 = " + result1);

		result1 = num1 % num2;
		System.out.println("num1 % num2 = " + result1 + "\n");


		// 대입 연산자
		num1 += num2; // 10 + 5
		System.out.println("num1 += num2 => num1 = " + num1);

		num1 -= num2; // 15 - 5
		System.out.println("num1 -= num2 => num1 = " + num1);

		num1 *= num2; // 10 * 5
		System.out.println("num1 *= num2 => num1 = " + num1);

		num1 /= num2; // 50 / 5
		System.out.println("num1 /= num2 => num1 = " + num1);

		num1 %= num2; // 10 % 5
		System.out.println("num1 %= num2 => num1 = " + num1 + "\n");


		// 관계 연산자
		num1 = 10;

		System.out.println("num1 > num2 = " + (num1 > num2));
		System.out.println("num1 >= num2 = " + (num1 >= num3));
		System.out.println("num1 < num2 = " + (num1 < num2));
		System.out.println("num1 <= num2 = " + (num1 <= num3));
		System.out.println("num1 == num2 = " + (num1 == num3));
		System.out.println("num1 != num2 = " + (num1 != num2) + "\n");


		// 논리 연산자
		boolean a = true;
		boolean b = false;
		System.out.println("a = " + a);
		System.out.println("b = " + b + "\n");

		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!a = " + !a);
		System.out.println("!b = " + !b);

	}

}
