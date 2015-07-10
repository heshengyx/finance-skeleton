package com.myself.finance.page;

public interface Dialect {
	public static enum Type {  
        MYSQL {  
            @SuppressWarnings("unused")
			public String getValue() {  
                return "mysql";  
            }  
        },  
        MSSQL {  
            @SuppressWarnings("unused")
			public String getValue() {  
                return "sqlserver";  
            }  
        },  
        ORACLE {  
            @SuppressWarnings("unused")
			public String getValue() {  
                return "oracle";  
            }  
        }
	}
	
	String getPageSql(String sql, int offset, int limit);
	String getPageSql(String sql, Page<?> page);
}
