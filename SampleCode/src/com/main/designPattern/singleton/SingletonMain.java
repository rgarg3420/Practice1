package com.main.designPattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonMain {

    public static void main(String[] args) {

	SingletonEnumClass singleObj = SingletonEnumClass.ABC;

	List<SingletonEnumClass> list = new ArrayList<SingletonEnumClass>();

	singleObj.print();

	list.add(singleObj);

	System.out.println("object :" + singleObj.toString() + " Object :" + singleObj.hashCode());

	SingletonEnumClass singleObj1 = SingletonEnumClass.ABC;
	singleObj1.print();
	System.out.println("object two:" + singleObj1.toString() + " Object :" + singleObj1.hashCode());

	list.add(singleObj1);

	System.out.println(singleObj.equals(singleObj1));
	System.out.println("size: " + list.size());
    }

}
