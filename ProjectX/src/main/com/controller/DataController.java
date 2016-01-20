package main.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import main.com.dtos.Customer;

@Controller
public class DataController extends AbstractController{

	@RequestMapping(value="/sendData", method=RequestMethod.POST)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("customer") Customer customer) throws Exception {
		
		System.out.println("The data in DataController method 1 :  Name: "+ customer.getName()+" Age: "+customer.getAge());
		// TODO Auto-generated method stub
		ModelAndView model = new ModelAndView();
		model.addObject("cName",customer.getName());
		model.addObject("cAge",customer.getAge());
		
		model.setViewName("UserData");
		return model;
	}

	
	@RequestMapping(value="/sendAjaxData", method = RequestMethod.POST)
			//,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	//@Produces(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_JSON)
	 @ResponseBody
	public ModelAndView printData(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute(value="customer") Customer customer) throws Exception {
	ModelAndView model = new ModelAndView();
	
	System.out.println("In data controller from ajax " );
	System.out.println("Name: "+customer.getName()+" Age: "+customer.getAge());
	
	model.setViewName("NewUserData");
	
	model.addObject("custData",customer);
		return model;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
