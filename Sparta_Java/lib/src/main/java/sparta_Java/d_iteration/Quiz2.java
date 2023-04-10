package sparta_Java.d_iteration;

public class Quiz2 {

	public static void main(String[] args) {

		// 5 ~ 1 카운트다운
		// 1. for문
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println();

		// 2. while문
		int i = 5;
		while (i > 0) {
			System.out.println(i--);
		}
		System.out.println();

		// 3. do-while문
		int j = 5;
		do {
			System.out.println(j--);
		} while (j > 0);

	}

}
