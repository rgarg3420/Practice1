package com.main.enumsample;

public class EnumMain {

    public static void main(String[] args) {

	boolean b1 = false;
	boolean b2 = false;
	if (b2 = b1 != b2) {
	    System.out.println("true");

	} else {
	    System.out.println("false");
	}

	SelectDay selectDay1 = new SelectDay(Day.SUNDAY);

	selectDay1.dayDescription();

	SelectDay selectDay2 = new SelectDay(Day.SATURDAY);

	selectDay2.dayDescription();

	SelectDay selectDay3 = new SelectDay(Day.FRIDAY);

	selectDay3.dayDescription();

	SelectDay selectDay4 = new SelectDay(Day.WEDNESDAY);

	selectDay4.dayDescription();

	SelectDay selectDay5 = new SelectDay(Day.TUESDAY);

	selectDay5.dayDescription();

	SelectDay selectDay6 = new SelectDay(Day.MONDAY);

	selectDay6.dayDescription();

    }

}
