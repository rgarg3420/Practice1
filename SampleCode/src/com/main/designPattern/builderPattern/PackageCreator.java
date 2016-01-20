package com.main.designPattern.builderPattern;

public class PackageCreator {

    private FoodSelector foodselect;
    private SeatSelector seatSelect;
    private int cost = 0;

    public void getFoodType(String foodType) {
	if (foodType.equalsIgnoreCase("VEG")) {
	    foodselect = new VegFood();
	    foodselect.orderFood(foodType);
	    cost = cost + foodselect.getCost();
	}
	if (foodType.equalsIgnoreCase("NONVEG")) {
	    foodselect = new NonVegFood();
	    foodselect.orderFood(foodType);
	    cost = cost + foodselect.getCost();
	}
    }

    public void getSeatType(String seatType) {
	if (seatType.equalsIgnoreCase("WINDOW")) {
	    seatSelect = new WindowSeat();
	    seatSelect.selectSeat(seatType);
	    cost = cost + seatSelect.getCost();
	}
	if (seatType.equalsIgnoreCase("ISLE")) {
	    seatSelect = new IsleSeat();
	    seatSelect.selectSeat(seatType);
	    cost = cost + seatSelect.getCost();
	}
    }

    public int getTotalCost() {
	System.out.println("Cost of seat and food :" + cost);
	return cost;
    }

}
