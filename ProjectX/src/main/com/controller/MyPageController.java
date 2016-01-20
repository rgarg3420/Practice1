package main.com.controller;

import java.util.Locale;

import main.com.dtos.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyPageController {
	
	/*@RequestMapping(value = "/myPage", method = RequestMethod.GET)
    public String home(Locale locale) {
    System.out.println("Welcome home! The client locale is {}."+ locale);
     ModelMap modelMap = new ModelMap();
     String fName = "Rohit";
     String lName = "Garg";
     
     modelMap.addAttribute("firtsName",fName);
     modelMap.addAttribute("lastName",lName);
     modelMap.addAttribute("customer",new Customer());
        return "myPage";
    }
	*/
	
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
    public ModelAndView home(Locale locale) {
    System.out.println("Welcome home! The client locale is {}."+ locale);
     ModelAndView modelMap = new ModelAndView();
     String fName = "Rohit";
     String lName = "Garg";
     
     modelMap.addObject("firtsName",fName);
     modelMap.addObject("lastName",lName);
     modelMap.addObject("customer",new Customer());
     modelMap.setViewName("myPage");
        return modelMap;
    }
	
	
	@RequestMapping(value = "/myNewPage", method = RequestMethod.GET)
    public ModelAndView neHome(Locale locale) {
    System.out.println("Welcome New home! The client locale is {}."+ locale);
     ModelAndView modelMap = new ModelAndView();

     modelMap.addObject("customer",new Customer());
     modelMap.setViewName("myNewPage");
        return modelMap;
    }
	
	@RequestMapping(value = "/NormalPage", method = RequestMethod.GET)
    public ModelAndView normalHome(Locale locale) {
    System.out.println("Welcome New home! The client locale is {}."+ locale);
     ModelAndView modelMap = new ModelAndView();

     modelMap.addObject("customer",new Customer());
     modelMap.setViewName("NormalPage");
        return modelMap;
    }

}
