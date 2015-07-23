package com.myself.finance.service;

import java.util.List;

import com.myself.finance.data.UserProductData;
import com.myself.finance.page.Page;
import com.myself.finance.param.UserProductQueryParam;

public interface UserProductService {

	List<UserProductData> list(Page<UserProductQueryParam> param);
}
