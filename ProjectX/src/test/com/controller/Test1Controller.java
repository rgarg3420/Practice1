package test.com.controller;



import junit.framework.Assert;
import main.com.controller.DataController;
import main.com.dtos.Customer;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;


import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:WebContent/WEB-INF/spring/servlet-context.xml")
public class Test1Controller {
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockmvc;
	
	private final AnnotationMethodHandlerAdapter handlerAdapter = new AnnotationMethodHandlerAdapter();
	  private MockHttpServletRequest request = new MockHttpServletRequest();
	  private MockHttpServletResponse response = new MockHttpServletResponse();
	
	@Before
	public void setup(){
		this.mockmvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	

Customer cust = new Customer();

DataController dataController = new DataController();
@Test
public void test2(){
	cust.setAge("12");
	cust.setName("raghu");
try {
	ModelAndView mav = dataController.printData(request, response, cust);
	assertEquals("NewUserData", mav.getViewName());
	assertEquals(cust, mav.getModel().get("custData"));
} catch (Exception e) {
	
	e.printStackTrace();
}
}
@After
public void printAfter(){
	System.out.println("Test Case 2 is completed!");
}

}
