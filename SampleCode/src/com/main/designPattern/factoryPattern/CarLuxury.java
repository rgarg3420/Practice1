package com.main.designPattern.factoryPattern;

public class CarLuxury extends CarAbstract {

    public CarLuxury() {
	super(CarType.LUXURY);
	constructCar();
	tyreType();
    }

    @Override
    public void constructCar() {
	System.out.println("Today we will construct a Mercedise E class!");
    }

    @Override
    public void tyreType() {
	System.out.println("It has big tyres, smooth suspension");
    }

    @Override
    public void carClass() {
	System.out.println("This is a Luxury class car.");
    }

}
