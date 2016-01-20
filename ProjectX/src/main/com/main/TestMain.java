package main.com.main;

import main.com.dtos.Customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("classpath:servlet-context.xml");

      Customer cust = (Customer)context.getBean("cust");
      cust.setAge("12");
      cust.setName("raghu");

      String name = cust.getName();
      String age = cust.getAge();
      
     System.out.println("Name: "+name+" Age :"+age);
      
      
   }
}