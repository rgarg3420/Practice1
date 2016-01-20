package com.main.designPattern.builderPattern;

public class TicketBooker {

    private String foodType;
    private String seatType;

    public TicketBooker(String foodType, String seatType) {

	this.foodType = foodType;
	this.seatType = seatType;
    }

    PackageCreator pk = new PackageCreator();

    public int bookTicket() {

	pk.getFoodType(foodType);
	pk.getSeatType(seatType);
	int cost = pk.getTotalCost();

	return cost;
    }

    public static double getTax(int cost) {
	double price = 0;
	if (cost >= 1200 && cost < 1400) {
	    price = (.12 * cost);
	}
	if (cost >= 1400) {
	    price = (.14 * cost);
	}
	return price;

    }

}
