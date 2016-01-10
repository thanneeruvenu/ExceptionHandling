package com.mycompany.exception;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandling {

	@Resource(name="errorCodes")
	public Error error;
	
	
	
	@ExceptionHandler(CustomGenericException.class)
	public ModelAndView handleCustomException(CustomGenericException ex) {
        System.out.println("Custom Exception handling");
		ModelAndView model = new ModelAndView("globalException");
	    ex.setErrorMsg(error.getErrorMap().get(ex.getErrorCode()));
        model.addObject("exception",ex);
		return model;
 
	}
 
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
 
		ModelAndView model = new ModelAndView("exception");
		model.addObject("exception",ex);
		return model;
 
	}
	
	 @ResponseStatus(value=HttpStatus.NOT_FOUND)
	 public ModelAndView handleError(){
		 System.out.println("handle page not found");
		 ModelAndView model = new ModelAndView("error");
		 return model;
	 }
	 
	 
	 @ExceptionHandler(Throwable.class)
	 public ModelAndView handleAllException(Throwable ex){
		 System.out.println("super class handling");
		 ModelAndView model = new ModelAndView("error");
		 return model;
	 }
}
