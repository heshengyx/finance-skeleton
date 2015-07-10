package com.myself.finance.param;

import java.util.Date;

public class RoleQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8764089104829692269L;
	private String name;
	private String status;
	private Date createTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
