package main.com.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.com.dtos.Customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ValidatorController {

	private static final Logger logger = LoggerFactory
			.getLogger(ValidatorController.class);

	@Autowired
	@Qualifier("customerValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value = "/ValidatePage", method = RequestMethod.GET)
	public ModelAndView normalHome(Locale locale) {
		System.out.println("Welcome Validation page! The client locale is {}."
				+ locale);
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("customer", new Customer());
		modelView.setViewName("ValidatePage");
		return modelView;
	}

	@RequestMapping(value = "/ValidateData", method = RequestMethod.POST)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute(value = "customer") @Validated Customer customer,
			BindingResult bindingResult) throws Exception {

		ModelAndView model = new ModelAndView();
		System.out.println("Name:" + customer.getName() + " Age: "
				+ customer.getAge());
		if (bindingResult.hasErrors()) {
			System.out.println("Returning empSave.jsp page");
			model.setViewName("ValidatePage");
			return model;
		}
		ModelMap mMap = new ModelMap();
		mMap.addAttribute("cName", customer.getName());
		mMap.addAttribute("cAge", customer.getAge());
		model.addAllObjects(mMap);
		model.setViewName("AfterValidation");

		return model;
	}

	@RequestMapping(value = "/jsValidatePage", method = RequestMethod.GET)
	public ModelAndView scriptValidation(Locale locale) {
		System.out
				.println("Welcome Validation page with js validation! The client locale is {}."
						+ locale);
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("customer", new Customer());
		modelView.setViewName("JSValidatePage");
		return modelView;
	}

}
