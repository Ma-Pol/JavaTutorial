package sparta_Java.j_error_exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int number = 10;
		int result;

		for (int i = 10; i >= 0; i--) {
			try {
				result = number / i;
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("Exception 발생: " + e.getMessage());
			} finally {
				System.out.println("항상 실행되는 finally 구문\n");
			}
		}

		try (FileOutputStream out = new FileOutputStream("test.txt")) {
			out.write("Hello Sparta".getBytes());
			out.flush();
			// 이 경우 자동으로 close() 처리를 해줌
		} catch (IOException e) {
			System.out.println("IOException 발생: " + e.getMessage());
			e.printStackTrace();
		}

	}

	void exceptionMethod() throws IOException {
		// 메서드 내용. Exception 처리
	}

}
