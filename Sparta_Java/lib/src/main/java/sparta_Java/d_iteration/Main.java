package sparta_Java.d_iteration;

public class Main {

	public static void main(String[] args) {

		// for문
		int sum1 = 0;
		for (int i = 0; i < 10; i++) {
			sum1 += (i + 1);
		}
		System.out.println(sum1 + "\n");

		// forEach문
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		for (String day : days) {
			System.out.println(day);
		}
		System.out.println();

		// while문
		int i = 0;
		int sum2 = 0;
		while (i < 10) {
			sum2 += (i + 1);
			i++;
			if (i == 5) {
				break;
			}
		}
		System.out.println(sum2 + "\n");

		// do-while문
		i = 0;
		int sum3 = 0;
		do {
			i++;
			if (i == 5) {
				continue;
			}
			sum3 += i;
		} while (i < 10);
		System.out.println(sum3 + "\n");
	}

}
