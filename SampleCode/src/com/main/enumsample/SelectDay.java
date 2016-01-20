package com.main.enumsample;

public class SelectDay {

    Day day;

    public SelectDay(Day day) {
	this.day = day;
    }

    public void dayDescription() {

	switch (day) {
	case SUNDAY:
	    System.out.println("This is best day !");

	    break;

	case MONDAY:
	    System.out.println("This gives Monday blues!!");
	    break;

	case TUESDAY:
	    System.out.println("Jai Hanuman!");
	    break;
	case SATURDAY:
	    System.out.println("Kudi saturday saturday kardi");
	    break;
	case FRIDAY:
	    System.out.println("Friday night party!");
	    break;
	default:
	    System.out.println("What!!??");
	    break;
	}

    }

}
