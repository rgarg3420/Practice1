package com.main.designPattern.builderPattern;

public class VegFood implements FoodSelector {

    @Override
    public void orderFood(String foodType) {
	System.out.println("Oder food: " + foodType);
    }

    public int getCost() {
	return 200;
    }
}
