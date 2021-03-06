package com.myself.finance.service;

import com.myself.finance.data.UserProductData;
import com.myself.finance.page.IPage;
import com.myself.finance.param.UserProductQueryParam;

public interface IUserProductService {

	IPage<UserProductData> query(UserProductQueryParam param);
}
