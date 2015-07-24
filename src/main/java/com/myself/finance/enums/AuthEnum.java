package com.myself.finance.enums;

public enum AuthEnum {

    CREDIT_AUTH("A", "信用认证"), 
    IDENTITY_AUTH("B", "身份认证"),
    EDUCATION_AUTH("C", "学历认证");
	
	private String value;
	private String text;
	
	private AuthEnum(String value, String text){
		this.value = value;
		this.text = text;
	}
	
	public String getValue(){
		return this.value;
	}
	public String getText(){
		return this.text;
	}
}
