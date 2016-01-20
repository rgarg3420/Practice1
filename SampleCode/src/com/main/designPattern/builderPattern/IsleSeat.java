package com.main.designPattern.builderPattern;

public class IsleSeat implements SeatSelector {

    @Override
    public void selectSeat(String seatType) {
	System.out.println("Selected seat : " + seatType);
    }

    public int getCost() {
	return 1200;
    }

}