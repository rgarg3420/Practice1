package com.main.designPattern.factoryPattern;

public class CarFactory {

    public CarAbstract buildCar(CarType cartype) {
	CarAbstract car = null;

	switch (cartype) {
	case MINI:
	    car = new CarMini();
	    break;

	case LUXURY:
	    car = new CarLuxury();
	    break;

	case SEDAN:
	    car = new CarSedan();
	    break;

	default:
	    System.out.println("NO SUCH CAR!");
	    break;
	}
	return car;

    }

}
