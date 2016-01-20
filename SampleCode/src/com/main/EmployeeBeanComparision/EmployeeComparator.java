package com.main.EmployeeBeanComparision;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeePojo> {

    public static Comparator<EmployeePojo> salaryComparator = new Comparator<EmployeePojo>() {

	@Override
	public int compare(EmployeePojo o1, EmployeePojo o2) {
	    if (o1.getEmpSalary() > o2.getEmpSalary()) {
		return 1;
	    } else if (o1.getEmpSalary() < o2.getEmpSalary()) {
		return -1;
	    }
	    return 0;
	}
    };

    public static Comparator<EmployeePojo> ageComparator = new Comparator<EmployeePojo>() {

	@Override
	public int compare(EmployeePojo o1, EmployeePojo o2) {
	    if (o1.getEmpAge() > o2.getEmpAge()) {
		return 1;
	    } else if (o1.getEmpAge() < o2.getEmpAge()) {
		return -1;
	    }
	    return 0;
	}
    };

    @Override
    public int compare(EmployeePojo o1, EmployeePojo o2) {
	// TODO Auto-generated method stub
	return 0;
    }

}
