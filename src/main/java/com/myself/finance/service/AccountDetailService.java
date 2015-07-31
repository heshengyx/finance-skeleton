package com.myself.finance.service;

import com.myself.finance.entity.AccountDetail;
import com.myself.finance.param.AccountDetailParam;

public interface AccountDetailService {

	void save(AccountDetail param);
	void update(AccountDetail param);
	void delete(AccountDetail param);
	AccountDetail getData(AccountDetail param);
	
	void save(AccountDetailParam param);
}
