package com.myself.finance.param;

import com.myself.finance.entity.User;

public class UserParam extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1242507282087988521L;
	private String kaptchaCode;
	private String kaptchaValue;
	
	public String getKaptchaCode() {
		return kaptchaCode;
	}
	public void setKaptchaCode(String kaptchaCode) {
		this.kaptchaCode = kaptchaCode;
	}
	public String getKaptchaValue() {
		return kaptchaValue;
	}
	public void setKaptchaValue(String kaptchaValue) {
		this.kaptchaValue = kaptchaValue;
	}
}
