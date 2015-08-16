package com.myself.finance.param;

import java.io.Serializable;

public class RolePermissionParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8405553509747154845L;
	private String roleId;
	private String[] permissionId;
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String[] getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String[] permissionId) {
		this.permissionId = permissionId;
	}
}
