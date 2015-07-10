package com.myself.finance.service;

import com.myself.finance.entity.User;

public interface UserService {

	int save(User user);
	User getUserByAccount(String account);
}
