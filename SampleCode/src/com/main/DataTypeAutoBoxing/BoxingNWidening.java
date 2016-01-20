package com.main.DataTypeAutoBoxing;

public class BoxingNWidening {

    public static void main(String[] args) {
	String point1 = "1. Primitive Widening > Boxing > Varargs.";
	String point2 = "2. Widening and Boxing (WB) not allowed.";
	String point3 = "3. Boxing and Widening (BW) allowed.";
	String point4 = "4. While overloading, Widening + vararg and Boxing + vararg can only be used in a mutually exclusive manner i.e. not together.";
	String point5 = "5. Widening between wrapper classes not allowed.";

	System.out.println("" + point1 + "\n" + point2 + "\n" + point3 + "\n" + point4 + "\n" + point5);

	BoxingNWidening bw = new BoxingNWidening();
	long l = 5;
	String ss = "20";
	String name = "Rohit";
	Integer integer = new Integer(10);
	int int1 = Integer.parseInt(ss);
	int sum = integer + int1;

	Integer integerM = Integer.valueOf(4);
	Integer integerN = Integer.valueOf("4");

	System.out.println("Hashcode are equal ? " + (integerM.hashCode() == integerN.hashCode()));
	System.out.println("object are equal ? " + (integerM.equals(integerM)));

	// int newsum = integer + integer1 + Integer.parseInt(name);
	// System.out.println("SUM :" + sum + "    New sum :" + newsum);

	bw.print1(5);
	bw.print2(5);
	bw.print3(new Integer(5));
	bw.print4(new Integer(10));
	bw.print6((short) 7);

    }

    private void print6(short i) {
	System.out.println("print short");
    }

    private void print6(short... i) {
	System.out.println("print short...");
    }

    public void print1(int i) {
	System.out.println("int value: " + i);
    }

    public void print1(Integer i) {
	System.out.println("Integer value: " + i);
    }

    public void print2(long i) {
	System.out.println("long value: " + i);
    }

    public void print2(Integer i) {
	System.out.println("Integer value: " + i);
    }

    public void print3(int... i) {
	System.out.println("int... value:" + i);
    }

    public void print3(Long l) {
	System.out.println("Long value:" + l);
    }

    public void print4(long l) {
	System.out.println("long value:" + l);
    }

    public void print5(Long l) {
	System.out.println("Long value:" + l);
    }

}
