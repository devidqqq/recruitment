package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.springBoot.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>,JpaSpecificationExecutor<UserInfo>{

	@Query(value="SELECT * FROM user_info WHERE user_name = ?1",nativeQuery=true)
	public UserInfo findUserByUserName(String userName);

}
