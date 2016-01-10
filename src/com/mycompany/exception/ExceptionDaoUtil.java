package com.mycompany.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExceptionDaoUtil {

private static ExceptionDaoTest exceptionDaoTest;
	
	@Autowired(required=true)
	public  void setExceptionDaoTest(ExceptionDaoTest exceptionDaoTest) {
		ExceptionDaoUtil.exceptionDaoTest = exceptionDaoTest;
	}

	public static void test() throws Exception{
		System.out.println("exceptionServiceTest");
		exceptionDaoTest.test();
	}
}
