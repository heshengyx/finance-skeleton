package com.myself.finance.data;

import java.io.Serializable;

public class PermissionTreeData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6704785301722575250L;
	private String id;
	private String parentId;
	private String name;
	private String tag;
	private boolean open;
	private boolean checked;
	
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
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
