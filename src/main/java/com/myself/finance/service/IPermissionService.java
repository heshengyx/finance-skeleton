package com.myself.finance.service;

import java.util.List;

import com.myself.finance.entity.Permission;
import com.myself.finance.page.IPage;
import com.myself.finance.param.PermissionQueryParam;

public interface IPermissionService {

	int save(Permission param);
	int update(Permission param);
	int delete(Permission param);
	Permission getData(Permission param);
	
	List<Permission> list(PermissionQueryParam param);
	IPage<Permission> query(PermissionQueryParam param);
	List<Permission> queryPermissionsByRoleId(String roleId);
}
