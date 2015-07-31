package com.myself.finance.service;

import com.myself.finance.entity.Account;

public interface AccountService {

	void save(Account param);
	void update(Account param);
	void delete(Account param);
	Account getData(Account param);
}
