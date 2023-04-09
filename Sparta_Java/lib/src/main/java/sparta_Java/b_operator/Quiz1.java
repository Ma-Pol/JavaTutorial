package sparta_Java.b_operator;

public class Quiz1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 3;
		boolean bool1 = true;
		boolean bool2 = false;

		num1 += num1; // 결과 : 10 + 10 = 20
		num2 *= num1; // 결과 : 3 * 20 = 60
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool1 && bool2); // 결과 : true && false = false

	}

}
