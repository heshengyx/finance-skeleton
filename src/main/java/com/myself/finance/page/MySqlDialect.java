package com.myself.finance.page;


public class MySqlDialect implements Dialect {
	
	public String getPageSql(String sql, int offset, int limit) {
		StringBuilder pageSql = new StringBuilder(sql);
		pageSql.append(" limit " + offset + "," + limit);
		return pageSql.toString();
	}

	public String getPageSql(String sql, Page<?> page) {
		int offset = (page.getPage() - 1) * page.getRows();
		return getPageSql(sql, offset, page.getRows());
	}
}
