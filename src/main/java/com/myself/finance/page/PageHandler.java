/* 
 * Copyright (c) 2015, S.F. Express Inc. All rights reserved.
 */
package com.myself.finance.page;



/**
 * 描述：
 * 
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2015年8月6日      601008         Create
 * ****************************************************************************
 * </pre>
 * 
 * @author 601008
 * @since 1.0
 */
public class PageHandler {

	/**
	 * 2015年8月7日 601008方法说明：
	 * @param pageSplit
	 * 			分页接口
	 * @param pageSize
	 * 			每一页记录条数
	 * @param pageNo
	 * 			页码
	 * @return
	 * IPage<T> 分页取得的记录
	 */
	/*public static <T> IPage<T> execute(PageSplit<T> pageSplit, int pageSize, int pageNo) {
		List<T> dataList = null;
		IPage<T> page = null;
		int totalRecord = pageSplit.queryTotalCount();
		if (totalRecord > 0) {
			pageNo = (pageNo <= 0) ? 1 : pageNo;
			int pageStart = (pageNo - 1) * pageSize;
			dataList = pageSplit.queryPageList(pageStart, pageSize);
			page = new Page<T>(dataList, totalRecord, pageNo, pageSize);
		}
		if (null == page) {
			page = new Page<T>(new ArrayList<T>(), 0, 1, 1);
		}
		return page;
	}*/
}
