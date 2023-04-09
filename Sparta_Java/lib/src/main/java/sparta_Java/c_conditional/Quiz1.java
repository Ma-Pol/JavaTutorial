package sparta_Java.c_conditional;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		// 입력받은 숫자를 등급으로 나누기
		// A등급: 100 ~ 91
		// B등급: 90 ~ 81
		// C등급: 80 ~ 71
		// F등급: 70 ~ 0
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

//		// 이건 그냥 추가해본 것
//		while (true) {
//			score = sc.nextInt();
//			if (score > 100 || score < 0) {
//				System.out.println("다시 입력해주세요");
//				continue;
//			}
//			break;
//		}

		if (score <= 100 && score > 90) {
			System.out.println("\nA등급");
		} else if (score <= 90 && score > 80) {
			System.out.println("\nB등급");
		} else if (score <= 80 && score > 70) {
			System.out.println("\nC등급");
		} else {
			System.out.println("\nF등급");
		}

		sc.close();

	}

}
