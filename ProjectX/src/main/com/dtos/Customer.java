package main.com.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {
	
@Size(max=30, min=3)
@NotNull
private String name;

@Max(150)
@NotNull
private String age;	
	
public Customer() {

}

public Customer(String sName, String sAge){
	name = sName;
	age = sAge;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

@Override
public String toString() {
	return "Customer [name=" + name + ", age=" + age + "]";
}





}
