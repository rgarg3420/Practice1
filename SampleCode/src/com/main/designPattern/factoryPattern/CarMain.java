package com.main.designPattern.factoryPattern;

public class CarMain {

    public static void main(String[] args) {

	CarFactory carfactory = new CarFactory();

	CarFactoryReflect reflectionCarFactory = new CarFactoryReflect();

	CarAbstract miniCar = carfactory.buildCar(CarType.MINI);

	miniCar.carClass();

	CarAbstract sedanCar = carfactory.buildCar(CarType.SEDAN);

	sedanCar.carClass();

	CarAbstract luxuryCar = carfactory.buildCar(CarType.LUXURY);

	luxuryCar.carClass();

	CarAbstract miniCarR = reflectionCarFactory.buildNewCar(CarMini.class.getName());

	miniCarR.carClass();

	CarAbstract sedanCarR = reflectionCarFactory.buildNewCar(CarSedan.class.getName());

	sedanCarR.carClass();

	CarAbstract luxuryCarR = reflectionCarFactory.buildNewCar(CarLuxury.class.getName());

	luxuryCarR.carClass();

    }

}
