package com.myself.finance.service;

import com.myself.finance.entity.Product;
import com.myself.finance.page.IPage;
import com.myself.finance.param.ProductQueryParam;

public interface IProductService {

	int save(Product param);
	int update(Product param);
	int delete(Product param);
	Product getData(Product param);
	
	IPage<Product> query(ProductQueryParam param);
}
