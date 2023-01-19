package com.greedy.section05.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application4 {
	
	public static void main(String[] args) {

		/* 0년 1월 1일 부터 오늘까지 몇 일이나 지났을까요?
		 * 단, 중간에 윤년을 고려해야 함 (738907일)
		 * */
		
		Calendar gregorianCalendar1 = new GregorianCalendar(0, Calendar.JANUARY, 1);
		Calendar gregorianCalendar2 = new GregorianCalendar(2023, Calendar.JANUARY, 19);
		
		long day = (gregorianCalendar2.getTimeInMillis() - gregorianCalendar1.getTimeInMillis()) / 1000;
		
		day = day / (60 * 60 * 24);
		
		System.out.println(day + 1);
		
		
		
		int sumDay = 0;
		
		/* 0년 1월 1일부터 2022년 12월 31일까지의 일수 */
		for(int i = 0; i < 2023; i++) {
			Calendar calendar = new GregorianCalendar(i, 11, 31);
			sumDay += calendar.get(Calendar.DAY_OF_YEAR);
		}
		
		/* (0년 1월 1일부터 2022년 12월 31일까지의 일수) + (2023년 1월 1일부터 2023년 1월 19일까지 일수) */
		sumDay += Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		System.out.println(sumDay);
		
		
	}
}
