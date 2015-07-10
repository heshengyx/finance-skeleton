package com.myself.finance.page;


public class OracleDialect implements Dialect {

	public String getPageSql(String sql, int offset, int limit) {
		return null;
	}

	public String getPageSql(String sql, Page<?> page) {
		return null;
	}

}
