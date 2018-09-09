package com.springBoot.service;

import com.springBoot.entity.UserInfo;

public interface UserInfoService {
	
	/**
	 * 根据ID查询用户实体
	 * @param id
	 * @return UserInfo
	 */
	public UserInfo findById(String id);
	
	/**
	 * 根据用户名查询用户实体
	 * @param userName
	 * @return UserInfo
	 */
	public UserInfo findByUserName(String userName);
	
	/**
	 * 保存一条数据
	 * @param userInfo
	 * @return UserInfo 返回保存的用户实体
	 */
	public UserInfo saveOne(UserInfo userInfo);

}
