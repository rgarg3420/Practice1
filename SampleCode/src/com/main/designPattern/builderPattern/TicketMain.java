package com.main.designPattern.builderPattern;

public class TicketMain {

    public static void main(String s[]) {

	TicketBooker tb1 = new TicketBooker("VEG", "WINDOW");
	TicketBooker tb2 = new TicketBooker("VEG", "ISLE");
	int price = tb1.bookTicket();

	double tax = tb1.getTax(price);

	System.out.println("TOTAL: " + (price + tax));

	int price1 = tb2.bookTicket();

	double tax1 = tb2.getTax(price);

	System.out.println("TOTAL: " + (price1 + tax1));

    }

}
