package com.main.EmployeeBeanComparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.comparators.ComparatorChain;

public class EmployeeMain {

    @SuppressWarnings("unchecked")
    public static void main(String s[]) {

	List<EmployeePojo> employeeList = EmployeeMain.createData();

	for (EmployeePojo employeePojo : employeeList) {
	    System.out.println("ID :" + employeePojo.getEmpId() + " Name :" + employeePojo.getEmpName() + " Age : "
		    + employeePojo.getEmpAge() + " Salary: " + employeePojo.getEmpSalary());
	}

	ComparatorChain chain = new ComparatorChain();
	chain.addComparator(new EmployeeComparator().ageComparator);
	chain.addComparator(new EmployeeComparator().salaryComparator);

	Collections.sort(employeeList, chain);

	System.out.println("After Sorting values :");
	for (EmployeePojo employeePojo : employeeList) {
	    System.out.println("ID :" + employeePojo.getEmpId() + " Name :" + employeePojo.getEmpName() + " Age : "
		    + employeePojo.getEmpAge() + " Salary: " + employeePojo.getEmpSalary());
	}

	Collections.shuffle(employeeList);

	System.out.println("Before Sorting values :");
	for (EmployeePojo employeePojo : employeeList) {
	    System.out.println("ID :" + employeePojo.getEmpId() + " Name :" + employeePojo.getEmpName() + " Age : "
		    + employeePojo.getEmpAge() + " Salary: " + employeePojo.getEmpSalary());
	}

	Collections.sort(employeeList);

	System.out.println("After Sorting values again :");
	for (EmployeePojo employeePojo : employeeList) {
	    System.out.println("ID :" + employeePojo.getEmpId() + " Name :" + employeePojo.getEmpName() + " Age : "
		    + employeePojo.getEmpAge() + " Salary: " + employeePojo.getEmpSalary());
	}

    }

    private static List<EmployeePojo> createData() {

	List<EmployeePojo> empList = new ArrayList<EmployeePojo>();

	for (int i = 6; i >= 1; i--) {
	    EmployeePojo employee = new EmployeePojo();
	    employee.setEmpAge((i * 10) + i);
	    employee.setEmpCity("City" + i);
	    employee.setEmpId(i);
	    employee.setEmpName("Employee" + i);
	    employee.setEmpSalary((Math.random() * 1000));
	    empList.add(employee);
	}
	EmployeePojo employee = new EmployeePojo();
	employee.setEmpAge(22);
	employee.setEmpCity("CityPalace");
	employee.setEmpId(7);
	employee.setEmpName("Employee" + 7);
	employee.setEmpSalary(1000.00);
	empList.add(employee);
	Collections.shuffle(empList);

	return empList;

    }

}
