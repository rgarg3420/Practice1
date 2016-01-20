/**
 * 
 */
package com.main.DISample.ImplClass;

import com.main.DISample.Interface.Service;

/**
 * @author Rohit Garg
 *
 */
public class ServiceImpl implements Service {

    /* (non-Javadoc)
     * @see com.main.DISample.Interface.Service#sendMessages(java.lang.String, java.lang.String)
     */
    @Override
    public void sendMessages(String sender, String reciever) {
	System.out.println("The message has been sent to "+ reciever +" from "+ sender);
    }

}
