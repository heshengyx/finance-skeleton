package com.myself.finance.service;

import com.myself.finance.entity.User;
import com.myself.finance.param.UserParam;

public interface UserService {

	int save(User param);
	int update(User param);
	int delete(User param);
	User getData(User param);
	
	void register(UserParam param);
}
