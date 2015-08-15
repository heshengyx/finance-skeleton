package com.myself.finance.param;

import java.io.Serializable;

public class UserRoleParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9215633366348736381L;
	private String userId;
	private String[] roleId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String[] getRoleId() {
		return roleId;
	}
	public void setRoleId(String[] roleId) {
		this.roleId = roleId;
	}
}
