package com.main.GenericClass;

public class GenericClass<E> {
	
	Class cls = null;
	
	public GenericClass(Class clas) {
		cls = clas;
		System.out.println("The class type :" + cls.getSimpleName());
	}
	
	
	public E createInstance() throws InstantiationException, IllegalAccessException{
		
     return (E) this.cls.newInstance();
	}

}
