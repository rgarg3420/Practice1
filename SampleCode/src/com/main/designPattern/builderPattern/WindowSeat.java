package com.main.designPattern.builderPattern;

public class WindowSeat implements SeatSelector {

    @Override
    public void selectSeat(String seatType) {
	System.out.println("Selected seat : " + seatType);
    }

    public int getCost() {
	return 1000;
    }

}
