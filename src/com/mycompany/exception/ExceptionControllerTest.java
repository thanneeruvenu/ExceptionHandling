package com.mycompany.exception;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionControllerTest {
 
	@Resource(name="exceptionServiceTest")
    public ExceptionServiceTest exceptionServiceTest;
	
	@RequestMapping(value="/test")
	public String test() throws Exception{
		System.out.println("test controller");
		System.out.println(exceptionServiceTest);
		ExceptionServiceTest.test();
		return "index";
	}
}
