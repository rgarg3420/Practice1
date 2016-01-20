package com.main.designPattern.flyweightPattern;

public class ShapeClass implements ShapeInterface {

    private int x;
    private int y;
    private int radius;
    private String color;

    public ShapeClass(String color) {
	this.color = color;
    }

    public ShapeClass() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {

	System.out.println("x: " + x + " y: " + y + " radius: " + radius + " color:" + color);
    }

    /**
     * @return the x
     */
    public int getX() {
	return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public void setX(int x) {
	this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
	return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public void setY(int y) {
	this.y = y;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
	return radius;
    }

    /**
     * @param radius
     *            the radius to set
     */
    public void setRadius(int radius) {
	this.radius = radius;
    }

    /**
     * @return the color
     */
    public String getColor() {
	return color;
    }

    /**
     * @param color
     *            the color to set
     */
    public void setColor(String color) {
	this.color = color;
    }

    public void printhashcode() {
	System.out.println("Hash :" + this.hashCode());
    }

}
