package com.springBoot.service.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.springBoot.entity.UserInfo;
import com.springBoot.repository.UserInfoRepository;
import com.springBoot.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoRepository userInfoRespository;

	@Override
	public UserInfo findById(String id) {
		// TODO Auto-generated method stub
		return userInfoRespository.getOne(id);// 返回对象引用，findOne返回对象实体
	}

	@Override
	public UserInfo findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userInfoRespository.findUserByUserName(userName);
	}

	@Override
	public UserInfo saveOne(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoRespository.save(userInfo);
	}

}
