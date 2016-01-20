package com.main.DISample.ImplClass;

import com.main.DISample.Interface.Consumer;
import com.main.DISample.Interface.Injecector;

public class InjectorImpl implements Injecector {

    public Consumer consumer;
    
    public InjectorImpl(){
	
    }
    
    @Override
    public Consumer getConsumer() {
	return new ConsumerImpl(new ServiceImpl());

    }

}
