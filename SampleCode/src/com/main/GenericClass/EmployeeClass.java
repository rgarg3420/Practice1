package com.main.GenericClass;

public class EmployeeClass {
	
private int Id ;
private String empName;


public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
public String toString() {
	return "EmployeeClass [Id=" + Id + ", empName=" + empName + "]";
}


}
