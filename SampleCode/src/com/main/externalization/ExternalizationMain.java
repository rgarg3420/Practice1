package com.main.externalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationMain {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	File file = new File("E:\\EmployeeData.txt");
	if(!file.exists()){
	    file.createNewFile();
	}
	
	EmployeeData emp = new EmployeeData("Hera",23,"Dilli");
	
	ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
	ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
	
	os.writeObject(emp);
	EmployeeData emp1 = (EmployeeData) is.readObject();

	os.flush();
	os.close();
	is.close();
	
	System.out.println("Data :"+ emp1.toString());
	
    }

}
