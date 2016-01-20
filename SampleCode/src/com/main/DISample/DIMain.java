package com.main.DISample;


import com.main.DISample.ImplClass.InjectorImpl;
import com.main.DISample.Interface.Consumer;
import com.main.DISample.Interface.Injecector;

public class DIMain {

    
    
    public static void main(String[] args) {
	
	Injecector injector ;
	String sender = "Rohit";
	String reciever = "Mohit";
	injector = new InjectorImpl();
	
	Consumer consumer = injector.getConsumer();

	consumer.getMessageService(sender, reciever);
	
    }

}
