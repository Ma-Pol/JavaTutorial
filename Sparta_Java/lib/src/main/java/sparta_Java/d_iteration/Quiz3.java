package sparta_Java.d_iteration;

public class Quiz3 {

	public static void main(String[] args) {

		// 1 ~ 30 홀수의 합, 짝수의 합 각각 출력
		// 1. for문
		int odd = 0;
		int even = 0;
		for (int i = 0; i < 30; i++) {
			if ((i + 1) % 2 == 0) {
				even += (i + 1);
			} else {
				odd += (i + 1);
			}
		}
		System.out.println("홀수의 합: " + odd);
		System.out.println("짝수의 합: " + even + "\n");

		// 2. while문
		odd = 0;
		even = 0;
		int i = 0;
		while (i < 30) {
			if ((i + 1) % 2 == 0) {
				even += (i + 1);
			} else {
				odd += (i + 1);
			}
			i++;
		}
		System.out.println("홀수의 합: " + odd);
		System.out.println("짝수의 합: " + even + "\n");

		// 3. do-while문
		odd = 0;
		even = 0;
		int j = 0;
		do {
			if ((j + 1) % 2 == 0) {
				even += (j + 1);
			} else {
				odd += (j + 1);
			}
			j++;
		} while (j < 30);
		System.out.println("홀수의 합: " + odd);
		System.out.println("짝수의 합: " + even + "\n");
	}

}
