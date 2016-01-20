package com.main.DateFormatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormation {

    public static void main(String[] args) {

	String startDate = "12-02-2015";
	String endDate = "22-02-2015";

	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

	try {
	    Date sDate = sdf.parse(startDate);
	    Date eDate = sdf.parse(endDate);

	    long sTime = sDate.getTime();
	    long eTime = eDate.getTime();

	    long timeDiff = eTime - sTime;

	    long days = ((((timeDiff / 1000) / 60) / 60) / 24);

	    System.out.println("Days:" + days);

	} catch (ParseException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	String ss = "hello my name ? this is home. where is your";

	String[] sp = ss.split("\\?|\\.");

	for (String string : sp) {
	    System.out.println(string);
	}

	Date sysDate = new Date();

	DateFormat sd = new SimpleDateFormat("dd-MM-yyy");

	System.out.println(sd.format(sysDate));

    }

}
