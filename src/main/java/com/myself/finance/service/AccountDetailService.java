package com.myself.finance.service;

import com.myself.finance.entity.AccountDetail;

public interface AccountDetailService {

	void save(AccountDetail param);
	void update(AccountDetail param);
	void delete(AccountDetail param);
	AccountDetail getData(AccountDetail param);
}
