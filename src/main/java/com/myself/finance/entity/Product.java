package com.myself.finance.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1644614717877482674L;
	private String id;
	private String name;
	private String status;
	private Date createTime;
	private Date updateTime;
	private String remarks;
	
	private String userId;
	private String title;
	private String term;
	private String level;
	private String biddingType;
	private long yearRate;
	private long money;
	private String repayment;
	private String useDesc;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getBiddingType() {
		return biddingType;
	}
	public void setBiddingType(String biddingType) {
		this.biddingType = biddingType;
	}
	public long getYearRate() {
		return yearRate;
	}
	public void setYearRate(long yearRate) {
		this.yearRate = yearRate;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public String getRepayment() {
		return repayment;
	}
	public void setRepayment(String repayment) {
		this.repayment = repayment;
	}
	public String getUseDesc() {
		return useDesc;
	}
	public void setUseDesc(String useDesc) {
		this.useDesc = useDesc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
