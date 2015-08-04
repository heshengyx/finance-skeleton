package com.myself.finance.service;

import java.util.List;

import com.myself.finance.entity.AccountTrade;
import com.myself.finance.page.Page;
import com.myself.finance.param.AccountTradeQueryParam;

public interface AccountTradeService {

	void save(AccountTrade param);
	void update(AccountTrade param);
	void delete(AccountTrade param);
	AccountTrade getData(AccountTrade param);
	
	List<AccountTrade> list(Page<AccountTradeQueryParam> param);
}
