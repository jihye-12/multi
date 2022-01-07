package ch10;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//System.out.println(now.toGMTString()); //버전업그레이드 되면서 앞으로 신규 프로젝트에서는 지양 권고
		//Date d1 = new Date(2022, 1, 6, 15, 12, 23);
		
		Calendar cal = Calendar.getInstance(); //private생성자 객체생성x calendar 객체 리턴
		System.out.println(cal); //날짜, 시간 관련 정보
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //0~11
		int day = cal.get(Calendar.DAY_OF_MONTH)+30;
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + min + "분 " + second + "초");
		
		//DAY_OF_WEEK : 요일 0:일 1:월
		String[] weekday = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		//cal에서 요일 추출하여 weekday 값으로 출력		
		System.out.println(weekday[week-1]);
	}

}
