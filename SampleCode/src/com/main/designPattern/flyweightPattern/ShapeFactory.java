package com.main.designPattern.flyweightPattern;

import java.util.HashMap;

public class ShapeFactory {

    HashMap<String, ShapeClass> shapeMap = new HashMap<String, ShapeClass>();

    public ShapeClass getCircle(String color) {

	ShapeClass scl = shapeMap.get(color);

	if (scl == null) {
	    ShapeClass newScl = new ShapeClass(color);
	    shapeMap.put(color, newScl);
	    return newScl;
	}

	return scl;

    }

}
