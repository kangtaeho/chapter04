package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String [] args){
	
		Date now = new Date(); //현제시간
		printDate(now);
		printDate2(now);
		
		Date d1 = new Date(2000, 0, 16); //deprecated
		printDate(d1);
		
		//sus(~1900), 월(0~11), 일, 시, 분, 초
		Date d2 = new Date(100, 0, 16, 13, 25, 30);
		printDate(d2);
	}
	
	public static void printDate(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println(sdf.format(d));
	}
	
	
	
	public static void printDate2(Date d){
		//년도+1900
		int year = d.getYear(); //deprcated, 사용하지 말것(줄이 쫙 깔림)
		
		//월 (0~12)
		int month = d.getMonth();
		
		//일
		int date = d. getDate();
		
		//시
		int minutes = d.getMinutes();
		
		//초
		int seconds= d.getSeconds();
		
		System.out.println(
				(year+1900));
	}
}
