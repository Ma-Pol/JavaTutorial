package sparta_Java.k_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		System.out.println("now usages : 현재 시각을 설정");

		LocalDate date = LocalDate.now(); // 연-월-일
		LocalTime time = LocalTime.now(); // 시:분:초.ms
		LocalDateTime datetime = LocalDateTime.now(); // 위의 총합

		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime + "\n");

		System.out.println("of() usage : 특정 시각을 설정");
		LocalDate dateOf = LocalDate.of(2021, 3, 30);
		LocalTime timeOf = LocalTime.of(22, 50, 5);

		System.out.println(dateOf);
		System.out.println(timeOf + "\n");

		// 날짜, 시간 포맷 변경
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		String shortFormat = formatter.format(LocalTime.now());
		System.out.println(shortFormat + "\n");

		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String myDate = myFormatter.format(LocalDate.now());
		System.out.println(myDate);

		// 날짜, 시간 계산
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1996, 7, 17);
		Period period = Period.between(today, birthday);
		System.out.print("제가 태어난 지 " + -period.getYears() + "년 ");
		System.out.print(-period.getMonths() + "월 ");
		System.out.println(-period.getDays() + "일이 지났습니다.");
	}

}
