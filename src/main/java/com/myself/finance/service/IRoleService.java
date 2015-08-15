package com.myself.finance.service;

import java.util.List;

import com.myself.finance.data.RoleTreeData;
import com.myself.finance.entity.Role;
import com.myself.finance.page.IPage;
import com.myself.finance.param.RoleQueryParam;
import com.myself.finance.param.UserRoleParam;

public interface IRoleService {

	int save(Role param);
	int update(Role param);
	int delete(Role param);
	Role getData(Role param);
	
	IPage<Role> query(RoleQueryParam param);
	List<Role> list(RoleQueryParam param);
	
	void saveUserRoles(UserRoleParam param);
	List<Role> queryRolesByUserId(String userId);
	List<RoleTreeData> tree(RoleQueryParam param);
}
