package com.tejas.testcases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {

	public static void main(String[] args) {
//		String example = "01OCT12 14:26";
		String example = "infra.2016-07-20-12-31.log.gz";
		
        String pattern ="^([\\w\\-]+).((\\d\\d-\\d\\d-\\d\\d)|(\\d\\d\\d\\d-\\d\\d-\\d\\d))-\\d\\d-\\d\\d.log.gz";
        		//"^(\\d{2})(?:OCT|NOV)(\\d{2}) (\\d{1,2}):(\\d{2})$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(example);

        if (m.find()) 
        {    System.out.println(m.group(0));
        
        
        	   String logtype= m.group(1);
        	   System.out.println(logtype);
        	   SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
        	   SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        	   String d = m.group(2);
        	   System.out.println(d.length());
        	   if(d.length()==8){
        		   try {
        			   
					Date D1 = format.parse(d);
					System.out.println(D1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	   }else{
        		   if(d.length()==10){
        		   try {
					Date D1 = format1.parse(d);
					System.out.println(D1);
				   } catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	   }
        	   }
        	System.out.println();
            //prints example
            System.out.println(m.group());

            System.out.println(m.group(1)); //prints 01
            System.out.println(m.group(2)); //prints 12
          //  System.out.println(m.group(3)); //prints 14
          //  System.out.println(m.group(4)); //prints 26
        }

	}
}
