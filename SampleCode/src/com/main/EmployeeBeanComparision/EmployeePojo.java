package com.main.EmployeeBeanComparision;

import java.io.Serializable;

public class EmployeePojo implements Serializable, Comparable<EmployeePojo>, Cloneable {

    /**
     * 
     */
    private static final long serialVersionUID = 4253167893829051761L;
    private String empName;
    private Integer empAge;
    private Integer empId;
    private String empCity;
    private Double empSalary;

    /**
     * @return the empName
     */
    public String getEmpName() {
	return empName;
    }

    /**
     * @param empName
     *            the empName to set
     */
    public void setEmpName(String empName) {
	this.empName = empName;
    }

    /**
     * @return the empAge
     */
    public Integer getEmpAge() {
	return empAge;
    }

    /**
     * @param empAge
     *            the empAge to set
     */
    public void setEmpAge(Integer empAge) {
	this.empAge = empAge;
    }

    /**
     * @return the empId
     */
    public Integer getEmpId() {
	return empId;
    }

    /**
     * @param empId
     *            the empId to set
     */
    public void setEmpId(Integer empId) {
	this.empId = empId;
    }

    /**
     * @return the empCity
     */
    public String getEmpCity() {
	return empCity;
    }

    /**
     * @param empCity
     *            the empCity to set
     */
    public void setEmpCity(String empCity) {
	this.empCity = empCity;
    }

    /**
     * @return the empSalary
     */
    public Double getEmpSalary() {
	return empSalary;
    }

    /**
     * @param empSalary
     *            the empSalary to set
     */
    public void setEmpSalary(Double empSalary) {
	this.empSalary = empSalary;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(EmployeePojo o) {

	return this.getEmpAge() - o.getEmpAge();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

	return super.clone();
    }

    @Override
    public int hashCode() {

	int hashGenerator = 37;

	int hash = (hashGenerator * this.empId + hashGenerator * this.empAge);

	return hash;

    }

}
