package sparta_Java.u_networking;

import java.io.IOException;

import retrofit2.Call;

public class Main {

	public static void main(String[] args) {

		Call<Object> result = RetrofitClient.getApi().getUsers(1);

		try {
			System.out.println(result.execute().body());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
