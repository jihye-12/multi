package ch10;

import java.util.Calendar;

public class DateTest2 {

	public static void main(String[] args) {
		// 시작 시간
		Calendar cal = Calendar.getInstance();
		long starttime = cal.getTimeInMillis();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + min + "분 " + sec + "초");

		// 정해진 시간만큼 아무 것도 하지 않는 메소드(단위: ms)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 종료 시간
		Calendar cal2 = Calendar.getInstance();
		long endtime = cal2.getTimeInMillis();

		System.out.println(endtime - starttime + "ms 경과됨");
	}

}
