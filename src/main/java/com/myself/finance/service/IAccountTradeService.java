package com.myself.finance.service;

import com.myself.finance.entity.AccountTrade;
import com.myself.finance.page.IPage;
import com.myself.finance.param.AccountTradeQueryParam;

public interface IAccountTradeService {

	void save(AccountTrade param);
	void update(AccountTrade param);
	void delete(AccountTrade param);
	AccountTrade getData(AccountTrade param);
	
	IPage<AccountTrade> query(AccountTradeQueryParam param);
}
