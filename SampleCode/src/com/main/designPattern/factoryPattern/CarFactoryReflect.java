package com.main.designPattern.factoryPattern;

public class CarFactoryReflect {

    public CarAbstract buildNewCar(String carType) {

	CarAbstract car = null;

	System.out.println("carType for reflection:" + carType);
	try {
	    car = (CarAbstract) Class.forName(carType).newInstance();
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return car;
    }

}
