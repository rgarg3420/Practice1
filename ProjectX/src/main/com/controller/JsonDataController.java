package main.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import main.com.dtos.Customer;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JsonDataController {
	
	
	@RequestMapping(value="/sendAjaxJsonData", method = RequestMethod.POST,
			headers = {"Content-type=application/json"})
@Consumes("application/json")
@ResponseBody
public String printData(HttpServletRequest request,
	HttpServletResponse response, @RequestBody Customer customer) throws Exception {
ModelAndView model = new ModelAndView();

System.out.println("In data controller from ajax " );
System.out.println("Name: "+customer.getName()+" Age: "+customer.getAge());

model.setViewName("NewUserData");

model.addObject("custData",customer);
return "Success";
}
	
	@RequestMapping(value="/sendAjaxNormalData", method = RequestMethod.POST)

@ResponseBody
public String printNormalData(HttpServletRequest request,
	HttpServletResponse response) throws Exception {
ModelAndView model = new ModelAndView();
Customer customer = new Customer();
System.out.println("In Normal data controller from ajax " );

String data = request.getParameter("Jdata");

System.out.println("The data is :"+ data);
JsonFactory jfactory = new JsonFactory();
JsonParser jParser = jfactory.createJsonParser(data);

while(jParser.nextToken()!=JsonToken.END_OBJECT){
	if("name".equals(jParser.getCurrentName())){
		jParser.nextToken();
		customer.setName(jParser.getText());
	}
	
	if("age".equals(jParser.getCurrentName())){
		jParser.nextToken();
		customer.setAge(jParser.getText());
	}
}

System.out.println(customer.toString());

model.setViewName("NewNormalUserData");


return "Success";
}
	
	

	
	

}
