package com.myself.finance.service;

import com.myself.finance.entity.User;
import com.myself.finance.param.UserParam;

public interface UserService {

	int save(User user);
	User getUserByAccount(String account);
	
	void register(UserParam param);
}
