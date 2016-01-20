package com.main.QSchedular;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class IOFile {

    public static void main(String[] args) throws SchedulerException {
	
	
	
	//Quartz 1.6.3
    	//JobDetail job = new JobDetail();
    	//job.setName("dummyJobName");
    	//job.setJobClass(HelloJob.class);    	
    	JobDetail job = JobBuilder.newJob(HelloJob.class)
		.withIdentity("dummyJobName", "group1").build();

	//Quartz 1.6.3
    	//CronTrigger trigger = new CronTrigger();
    	//trigger.setName("dummyTriggerName");
    	//trigger.setCronExpression("0/5 * * * * ?");
    	
    	Trigger trigger = TriggerBuilder
		.newTrigger()
		.withIdentity("dummyTriggerName", "group1")
		.withSchedule(
			CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
		.build();
    	
    	//schedule it
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.getContext().put("counter", 10);
    	scheduler.start();
    	scheduler.scheduleJob(job, trigger);

    }

}
