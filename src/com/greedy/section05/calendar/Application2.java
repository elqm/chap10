package com.greedy.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

	public static void main(String[] args) {

		/* Calendar */
		
		/* Calendar 클래스를 이용한 인스턴스 생성 방법
		 * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
		 * 2. 후손 클래스인 GregorianCalender 클래스를 이용해서 인스턴스를 생성하는 방법
		 * */
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		Calendar gregorianCalendar = new GregorianCalendar();
		System.out.println(gregorianCalendar);
		
		int year = 2014;
		int month = 8;
		int dayOfMonth = 18;
		int hour = 16;
		int min = 42;
		int second = 0;
		
		Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		System.out.println(birthDay);
		
		java.util.Date date = new java.util.Date(birthDay.getTimeInMillis());		
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());
		System.out.println(date2);
		
		int birthYear = birthDay.get(1);		//1이 year을 의미
		int birthMonth = birthDay.get(2);		//2가 month를 의미
		int birthDayOfMonth = birthDay.get(5);	//5가 day를 의미
		
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDayOfMonth);
		
		System.out.println(calendar.YEAR);		//위의 1과 동일한 의미
		System.out.println(calendar.MONTH);		//위의 2와 동일한 의미
		System.out.println(calendar.DATE);		//위의 5와 동일한 의미
		
		System.out.println("year : " + birthDay.get(calendar.YEAR));
		System.out.println("month : " + birthDay.get(calendar.MONTH));
		System.out.println("day : " + birthDay.get(calendar.DATE));
		
		System.out.println("dayOfWeek : " + birthDay.get(calendar.DAY_OF_WEEK));
		
		String day = "";
		switch(birthDay.get(calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY : 
			day = "일요일";
			break;
		case Calendar.MONDAY :
			day = "월요일";
			break;
		case Calendar.TUESDAY :
			day = "화요일";
			break;
		case Calendar.WEDNESDAY : 
			day = "수요일";
			break;
		case Calendar.THURSDAY :
			day = "목요일";
			break;
		case Calendar.FRIDAY :
			day = "금요일";
			break;
		case Calendar.SATURDAY : 
			day = "토요일";
			break;
		}
		System.out.println("요일 : " + day);
		
		System.out.println("amPm : " + birthDay.get(Calendar.AM_PM));
		System.out.println(birthDay.get(Calendar.AM_PM) == Calendar.AM? "오전": "오후");
		
		System.out.println("hourOfDay : " + birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("hout : " + birthDay.get(Calendar.HOUR));
		
		System.out.println("min : " + birthDay.get(Calendar.MINUTE));
		System.out.println("second : " + birthDay.get(Calendar.SECOND));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(new Date(birthDay.getTimeInMillis()));
		
		System.out.println(result);		//월은 0~11로 표시하기 때문에 8월이 9월로 표기됨!
	}

}









