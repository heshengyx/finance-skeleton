package com.myself.finance.service;

import java.util.List;

import com.myself.finance.entity.UserAuth;
import com.myself.finance.param.UserAuthQueryParam;

public interface UserAuthService {

	List<UserAuth> list(UserAuthQueryParam param);
}
