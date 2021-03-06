package com.belling.admin.service;


import java.sql.Timestamp;

import com.belling.admin.model.LoginLog;
import com.belling.base.model.Pagination;
import com.belling.base.service.BaseService;

/**
 * 登录日志服务接口
 * 
 * @author Sunny
 */
public interface LoginLogService extends BaseService<LoginLog, Integer> {
	
	/**
	 * 清理日志
	 * 
	 * @param startTime
	 * @return
	 */
	public void deleteByTime(String startTime);
	
	
	/**
	 * 分页
	 * 
	 * @param p 分页对象
	 * @return
	 */
	public Pagination<LoginLog> findPaginationByTime(String uId, String startTime, String endTime, Pagination<LoginLog> p);
}
