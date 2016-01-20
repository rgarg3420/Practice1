package com.main.designPattern.flyweightPattern;

public class MainShape {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

	ShapeFactory sf = new ShapeFactory();

	for (int i = 0; i <= 20; i++) {
	    ShapeClass sc = sf.getCircle(getRandomColor());
	    sc.setRadius(getRandomRad());
	    sc.setX(getRandomX());
	    sc.setY(getRandomY());
	    System.out.println("***********************************************");
	    System.out.println(sc.hashCode());
	    sc.draw();
	    System.out.println("______________________________________________");
	    System.out.println("\n");
	}

    }

    private static String getRandomColor() {
	return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
	return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
	return (int) (Math.random() * 100);
    }

    private static int getRandomRad() {
	return (int) (Math.random() * 100);
    }

}
