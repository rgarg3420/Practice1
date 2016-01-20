package com.main.QSchedular;

import java.io.Serializable;
import java.util.Date;

public class EmployeeData implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -7782735313232195157L;
    
    private String name ;
    private Integer id;
    private long date;
    
    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    EmployeeData(){
	
    }
    
    EmployeeData(String empName, Integer empId){
	this.name = empName;
	this.id = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  
    
}
