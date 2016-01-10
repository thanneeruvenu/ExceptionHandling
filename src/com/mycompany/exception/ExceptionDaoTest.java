package com.mycompany.exception;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class ExceptionDaoTest {

	public void test() throws Exception{
		// TODO Auto-generated method stub
		try {
			System.out.println("try block");
			throw new SQLException("SQLException");
		} catch (SQLException e) {
			System.out.println("catch block");
			// TODO Auto-generated catch block
			throw new CustomGenericException("ecom101",e.getMessage());
			}
	}

	
}
