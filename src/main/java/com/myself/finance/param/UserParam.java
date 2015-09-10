package com.myself.finance.param;

import java.io.Serializable;

public class UserParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1242507282087988521L;
	private String username;
	private String password;
	private boolean rememberMe;
	private String host;
	private String captcha;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}
