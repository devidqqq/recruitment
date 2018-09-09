package com.springBoot.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.springBoot.entity.UserInfo;
import com.springBoot.repository.UserInfoRepository;

public class MyRealm extends AuthorizingRealm{
	
	@Autowired
	private UserInfoRepository userInfoRepository;

	
	/**
	 * 权限认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		return null;
	}

	/**
	 * 身份认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String userName = (String) token.getPrincipal();
		UserInfo userInfo = userInfoRepository.findUserByUserName(userName);
		if(userInfo!=null) {
			AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userInfo.getUserName(),userInfo.getPassword(),"");
			return authenticationInfo;
		}else {
			return null;
		}
	}

}
