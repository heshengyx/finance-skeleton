package com.myself.finance.data;

import java.io.Serializable;

public class RoleTreeData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5722850594053908604L;
	private String id;
	private String name;
	private String tag;
	private boolean checked;
	
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
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}
