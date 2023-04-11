package sparta_Java.j_error_exception;

class ArrayCalculation {

	int[] arr = { 0, 1, 2, 3, 4 };

	public int divide(int denominatorIndex, int numeratorIndex)
			throws ArithmeticException, ArrayIndexOutOfBoundsException {
		return arr[denominatorIndex] / arr[numeratorIndex];
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		ArrayCalculation arrayCalculation = new ArrayCalculation();

		try {
			System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
			System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0));
		} catch (ArithmeticException e1) {
			System.out.println("0으로는 나눌 수 없습니다! [" + e1.getMessage() + "]");
		}

		try {
			System.out.println("Try to divide using out of index element = " + arrayCalculation.divide(5, 0));
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("사용할 수 있는 배열의 범위가 아닙니다! [" + e2.getMessage() + "]");
			System.out.println("사용 가능 범위 : 0 ~ " + (arrayCalculation.arr.length - 1));
		}

	}

}
