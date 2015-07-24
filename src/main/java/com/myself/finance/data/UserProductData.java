package com.myself.finance.data;

import java.io.Serializable;
import java.util.Date;

public class UserProductData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4188734964503493445L;
	private String username;
	private long money;
	private Date createTime;
	
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
