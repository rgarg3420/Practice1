package com.main.DISample.ImplClass;

import com.main.DISample.Interface.Consumer;
import com.main.DISample.Interface.Service;

public class ConsumerImpl implements Consumer {

    public Service service;
    @Override
    public void getMessageService(String sender, String reciever) {
	service.sendMessages(sender, reciever);

    }
    
    public ConsumerImpl(Service service){
	this.service = service;
    }

}
