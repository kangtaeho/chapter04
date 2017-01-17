package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); //카렌다는 객체가 선언되지 않는다 >추상클래스?
		Calendar cal = Calendar.getInstance(); //겟인스턴스  = 현제날자를 보여줌	
		printDate(cal);
		
		cal.set(Calendar. YEAR, 2007);
		cal.set(Calendar. MONTH, 10);
		cal.set(Calendar. DATE, 12);		
		printDate(cal);
		
		//기념일
		cal.set(2007,10,12);
		cal.add(Calendar.DATE, 100);
		printDate(cal);
	}
	
	public static void printDate(Calendar cal){
		String[] days ={"","일","월","화","수","목","금","토"} ;
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int day =cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec =cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+date);
	}

}
