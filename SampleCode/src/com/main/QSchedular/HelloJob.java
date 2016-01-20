package com.main.QSchedular;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;

public class HelloJob implements Job {
    static int counter = 0;
    OutputStreamWriter outWriter  = null;
    ObjectOutputStream oout = null;
    public void execute(JobExecutionContext context)
	    throws JobExecutionException {
	
	try {
	    if (counter == 0) {
		counter = (int) context.getScheduler().getContext()
			.getInt("counter");
	    }

	    System.out.println("Hello Quartz!" + counter);
	    counter = counter + 1;
	    String str = String.valueOf(counter);
	    
	    EmployeeData empData = new EmployeeData();
	    empData.setDate(System.currentTimeMillis());
	    empData.setId(counter);
	    empData.setName("NAME"+str);
	    
	    File file1 =new File("e:\\fileEmpObj.txt");
	    if(!file1.exists()){
		
		file1.createNewFile();
		
	}
	FileOutputStream fout1 = new FileOutputStream(file1,true);
	 oout = new ObjectOutputStream(fout1);
	oout.writeObject(empData.getDate()+" "+empData.getId()+ " "+ empData.getName());
	oout.writeChars("\n");
	oout.flush();
	oout.close();
		
		    String data = " This content will append to the end of the file";
			String data1 = "Start hello";
			File file =new File("e:\\fileObj.txt");
			
			//if file doesnt exists, then create it
			if(!file.exists()){
				
				    file.createNewFile();
				
			}
			if(file.exists()){
			    System.out.println("File is there!");
			}
			//true = append file
			// Writing string content in the file.
			FileOutputStream fout = new FileOutputStream(file,true);
			 outWriter = new OutputStreamWriter(fout);
			 outWriter.write(str);
			outWriter.append(data1);
			outWriter.append(data);
			outWriter.append("\n"); 
			outWriter.flush();
			outWriter.close();
		        System.out.println("Done");

			}catch(IOException | SchedulerException e){
			e.printStackTrace();   
			}
		finally{
		    if (  outWriter != null)
		    {
			try { outWriter.close(); } catch (IOException io) {io.printStackTrace();}
		    }
		    
		    if (  oout != null)
		    {
			try { oout.close(); } catch (IOException io) {io.printStackTrace();}
		    }
		}

    }
}
