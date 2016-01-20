package com.main.designPattern.factoryPattern;

public abstract class CarAbstract {

    private CarType carType = null;

    public CarAbstract(CarType carType) {
	this.carType = carType;

    }

    public abstract void constructCar();

    public abstract void tyreType();

    public void carClass() {

    }

}
