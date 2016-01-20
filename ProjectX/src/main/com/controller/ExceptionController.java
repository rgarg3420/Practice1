package main.com.controller;

import main.com.exception.CustomeException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(CustomeException.class)
	public ModelAndView customExceptionHandler(CustomeException ce){
		ModelAndView mav = new ModelAndView();
		mav.addObject("ErCode", ce.getCode());
		mav.addObject("ErMessage",ce.getMessage());
		mav.setViewName("customError");
		return mav;
	}
}
