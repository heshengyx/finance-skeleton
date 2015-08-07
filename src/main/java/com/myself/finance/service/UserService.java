package com.myself.finance.service;

import com.myself.finance.entity.User;
import com.myself.finance.page.IPage;
import com.myself.finance.param.UserParam;
import com.myself.finance.param.UserQueryParam;

public interface UserService {

	int save(User param);
	int update(User param);
	int delete(User param);
	User getData(User param);
	
	void register(UserParam param);
	IPage<User> query(UserQueryParam param);
}
