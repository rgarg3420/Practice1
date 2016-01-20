package test.com.controller;

import java.awt.print.Printable;

import junit.framework.Assert;
import main.com.controller.DataController;
import main.com.dtos.Customer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:WebContent/WEB-INF/spring/servlet-context.xml")
public class TestController {
	
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
	
@Test
public void test1()  throws Exception{
	Customer cust = new Customer();
	cust.setAge("12");
	cust.setName("raghu");
	  this.mockmvc.perform(post("/sendAjaxData").param("name", cust.getName()).param("age", cust.getAge()))
	  .andExpect(view().name("NewUserData"))
	  .andExpect(model().attributeExists("custData"))
	 
	 // .andExpect(model().attribute("customer", cust))
	  .andExpect(status().isOk());	 
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
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}



}
