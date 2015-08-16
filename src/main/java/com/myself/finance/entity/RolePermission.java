package com.myself.finance.entity;

import java.io.Serializable;

public class RolePermission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3650764161575799581L;
	private String roleId;
	private String permissionId;
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
}
