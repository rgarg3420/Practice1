package com.main.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeData implements Externalizable{

    private String name;
    private Integer age;
    private String address;
    
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(name);
	out.writeInt(age);
	
    }
    

    public EmployeeData() {
	super();
    }


    @Override
    public void readExternal(ObjectInput in) throws IOException,
	    ClassNotFoundException {
	name = (String)in.readObject();
	age = in.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public EmployeeData(String name, Integer age, String address) {
	
	this.name = name;
	this.age = age;
	this.address = address;
    }

    @Override
    public String toString() {
	return "EmployeeData [name=" + name + ", age=" + age + ", address="
		+ address + "]";
    }
    
    

}
