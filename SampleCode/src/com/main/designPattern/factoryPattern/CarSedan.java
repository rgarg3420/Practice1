package com.main.designPattern.factoryPattern;

public class CarSedan extends CarAbstract {

    public CarSedan() {
	super(CarType.SEDAN);
	constructCar();
	tyreType();

    }

    @Override
    public void constructCar() {
	System.out.println("Today we will construct a Honda Amaze!");
    }

    @Override
    public void tyreType() {
	System.out.println("It has average radius tyres , with grip.");

    }

    @Override
    public void carClass() {
	System.out.println("This is a Mid class car.");
    }

}
