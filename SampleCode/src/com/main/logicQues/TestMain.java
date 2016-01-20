package com.main.logicQues;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

	List<Birdy> list = new ArrayList<Birdy>();

	Dino d = new Dino();
	Bino b = new Bino();
	list.add(d);
	list.add(b);

	for (Birdy birdy : list) {
	    birdy.eat();
	    birdy.fly();
	}

    }
}
