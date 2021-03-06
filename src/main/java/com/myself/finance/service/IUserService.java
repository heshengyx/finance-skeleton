package com.myself.finance.service;

import com.myself.finance.entity.User;
import com.myself.finance.page.IPage;
import com.myself.finance.param.UserParam;
import com.myself.finance.param.UserQueryParam;

public interface IUserService {

	int save(User param);
	int update(User param);
	int delete(User param);
	User getData(User param);
	User getDataByUsername(User param);
	
	void register(UserParam param, String captcha);
	IPage<User> query(UserQueryParam param);
}
