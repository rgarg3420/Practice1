package com.main.designPattern.factoryPattern;

public class CarMini extends CarAbstract {

    public CarMini() {
	super(CarType.MINI);
	constructCar();
	tyreType();
    }

    @Override
    public void constructCar() {
	System.out.println("Today we will construct a Mini Cooper Today.");

    }

    @Override
    public void tyreType() {
	System.out.println("It has small radius tyres.");

    }

    @Override
    public void carClass() {
	System.out.println("This is a Small class car.");
    }

}
