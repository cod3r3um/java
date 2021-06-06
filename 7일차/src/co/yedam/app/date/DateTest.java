package co.yedam.app.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day_year = calendar.get(Calendar.DAY_OF_YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day_year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.println(calendar);
		
		System.out.println(System.currentTimeMillis());
		
		// 살아온 일수 계산
		Calendar bday = Calendar.getInstance();
		bday.set(1994, 11, 16);
		long dur = calendar.getTimeInMillis() - bday.getTimeInMillis();
		dur = dur/1000/60/60/24;
		System.out.println("일수: " + dur);
		
		// D-day 계산
		Calendar dday = Calendar.getInstance();
		dday.set(2021, 11, 16);
		long dur1 =  dday.getTimeInMillis() - calendar.getTimeInMillis();
		dur1 = dur1/1000/60/60/24;
		System.out.println(dur1 + "일 후");
		
		// 현재 날짜
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getYear() + "-" + currentDate.getMonth() + "-" + currentDate.getDayOfMonth());
		
		// 현재로부터 100일 후
		System.out.println("오늘로부터 100일 후" + currentDate.plusDays(100));		
		
	}
	
}
