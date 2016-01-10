package com.mycompany.exception;

public class CustomGenericException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4544030382697573772L;
	public String errorCode;
	public String errorMsg;

	public CustomGenericException() {
		// TODO Auto-generated constructor stub
	}

	public CustomGenericException(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;

	}

	public CustomGenericException(String erroCode){
		this.errorCode=erroCode;
	}
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
