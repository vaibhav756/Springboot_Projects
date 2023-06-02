package com.SpringBoot.exception;

public class ApiError {

	private String msg;
	private String code;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ApiError [msg=" + msg + ", code=" + code + "]";
	}
	
	
}
