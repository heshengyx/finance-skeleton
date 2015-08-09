package com.myself.finance.service;

import com.myself.finance.entity.Account;
import com.myself.finance.param.AccountParam;

public interface IAccountService {

	void save(Account param);
	void update(Account param);
	void delete(Account param);
	Account getData(Account param);
	
	void deposit(AccountParam param);
	void withdraw(AccountParam param);
}
