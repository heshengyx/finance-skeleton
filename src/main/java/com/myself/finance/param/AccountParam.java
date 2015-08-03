package com.myself.finance.param;

import java.io.Serializable;


public class AccountParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2131445865309332110L;
	private String amount;
	private String source;
	private String userId;
	private String accountId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
}
