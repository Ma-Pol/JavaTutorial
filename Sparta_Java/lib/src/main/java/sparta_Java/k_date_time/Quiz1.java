package sparta_Java.k_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Quiz1 {

	public static void main(String[] args) {
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH/mm/ss");
		String nowDateTime = myFormatter.format(LocalDateTime.now());
		System.out.println(nowDateTime);
	}

}
