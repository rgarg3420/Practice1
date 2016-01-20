package com.main.GenericClass;

public class StudentClass {
	
	private int rollNum;
	private String StuName;
	
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}

	@Override
	public String toString() {
		return "StudentClass [rollNum=" + rollNum + ", StuName=" + StuName
				+ "]";
	}
}
