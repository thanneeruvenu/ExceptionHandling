package com.mycompany.exception;

import org.springframework.stereotype.Service;

@Service
public class ExceptionServiceTest {

	
	/*static ExceptionDaoTest exceptionDaoTest;
	
	@Autowired(required=true)
	public  void setExceptionDaoTest(ExceptionDaoTest exceptionDaoTest) {
		ExceptionServiceTest.exceptionDaoTest = exceptionDaoTest;
	}*/

	public static void test() throws Exception{
		System.out.println("exceptionServiceTest");
		ExceptionDaoUtil.test();
	}
}
