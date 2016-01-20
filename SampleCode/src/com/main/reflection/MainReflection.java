package com.main.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainReflection {

	public static void main(String[] args) {


	Class cls =  MainReflection.class;
	String className = cls.getName();
	String canonical =  cls.getCanonicalName();
	System.out.println("Name :"+ className+" : canonical : "+canonical);
	
	try {
		Class classNameFor = Class.forName("com.main.reflection.MainReflection");
		
		String name = classNameFor.getSimpleName();
		
		System.out.println("Simple Name :"+ name);
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		Class myclassObj = Class.forName("com.main.reflection.MyClassOne");
		String myClassName = myclassObj.getCanonicalName() + " : "+ myclassObj.getName()+" : "+ myclassObj.getSimpleName();
		System.out.println(myClassName);
		
		int modifier =   myclassObj.getModifiers();
		
		System.out.println("modifier :"+ modifier);
		
		System.out.println(Modifier.isPublic(modifier));
		
		Method[] methodList =  myclassObj.getMethods();
		
		for(int i = 0 ; i<methodList.length;i++){
			System.out.println(methodList[i]+" : ");
		}
		
		Method method = myclassObj.getMethod("callMethod",null );
		
		System.out.println("Method name :"+ method.getName());
		
		Field[] fields =  myclassObj.getFields();		
		
		for(int i = 0 ; i<fields.length;i++){
			System.out.println(fields[i]+" : "+fields[i].getName()+ " : "+fields[i].getType()  );
		}
		
		Field[] decFields = myclassObj.getDeclaredFields();
		
		for(int i = 0 ; i<decFields.length;i++){
			System.out.println(decFields[i]+" : "+decFields[i].getName()+ " : "+decFields[i].getType()  );
		}
		
		Field fld = myclassObj.getDeclaredField("pro");
		
		fld.setAccessible(true);
		
		MyClassOne mso = new MyClassOne(11);
		
		 Object val = fld.get(mso);
		 
		 int intVal = (Integer)val;
		 
		 System.out.println("Value of protected field is :"+ intVal);
		
		
		
		
	} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | NoSuchFieldException | IllegalArgumentException | IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
