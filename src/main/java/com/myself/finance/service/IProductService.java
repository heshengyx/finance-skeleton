package com.myself.finance.service;

import java.util.List;

import com.myself.finance.entity.Product;
import com.myself.finance.page.IPage;
import com.myself.finance.page.Page;
import com.myself.finance.param.ProductQueryParam;

public interface IProductService {

	int save(Product param);
	int update(Product param);
	int delete(Product param);
	Product getData(Product param);
	List<Product> list(Page<ProductQueryParam> param);
	
	IPage<Product> query(ProductQueryParam param);
}
