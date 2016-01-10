package com.mycompany.exception;

import java.util.Map;

/**
 * @author invthannee
 *
 */
public class Error {

public Map<String,String> errorMap;

public Map<String, String> getErrorMap() {
	System.out.println(errorMap);
	return errorMap;
}

public void setErrorMap(Map<String, String> errorMap) {
	System.out.println(errorMap);
	this.errorMap = errorMap;
}

}
