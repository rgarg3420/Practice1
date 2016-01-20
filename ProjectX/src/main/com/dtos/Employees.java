package main.com.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private int empId;
	@NotNull
	private String empName;
	private String empdept;

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName
				+ ", empdept=" + empdept + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

}
