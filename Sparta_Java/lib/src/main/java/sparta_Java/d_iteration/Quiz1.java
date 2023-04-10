package sparta_Java.d_iteration;

public class Quiz1 {

	public static void main(String[] args) {

		// 1 ~ 100 합
		// 1. for문
		int sum1 = 0;
		for (int i = 0; i < 100; i++) {
			sum1 += (i + 1);
		}
		System.out.println(sum1);

		// 2. while문
		int sum2 = 0;
		int i = 0;
		while (i < 100) {
			sum2 += ++i;
		}
		System.out.println(sum2);

		// 3. do-while문
		int sum3 = 0;
		int j = 0;
		do {
			sum3 += ++j;
		} while (j < 100);
		System.out.println(sum3);

	}

}
