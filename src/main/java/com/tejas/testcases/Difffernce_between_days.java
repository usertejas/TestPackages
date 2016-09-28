package com.tejas.testcases;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;

public class Difffernce_between_days {
	public static void main(String[] args) {

		String dateStart = "16-06-30 09:29:58";
		String dateStop = "17-08-12 10:31:48";
        
		DateTime dt = new DateTime();
		
		System.out.println(dt);
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			DateTime dt1 = new DateTime(d1);
			DateTime dt2 = new DateTime(d2);
            
			System.out.print(Days.daysBetween(dt1, dt2).getDays() + " days, ");
			System.out.print(Hours.hoursBetween(dt1, dt2).getHours() % 24 + " hours, ");
			System.out.print(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60 + " minutes, ");
			System.out.print(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60 + " seconds.");

		 } catch (Exception e) {
			e.printStackTrace();
		 }

	  }


}
