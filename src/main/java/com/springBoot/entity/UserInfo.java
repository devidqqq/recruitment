package com.springBoot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_info")
public class UserInfo {
	
	@Id
	@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
	@GeneratedValue(generator = "jpa-uuid") 
	private String id; // 用户id，使用uuid自动插入
	@Column(length=50)
	private String userName; //用户名
	@Column(length=50)
	private String password; //密码
	@Column(length=20)
	private String tureName; // 真实姓名
	@Column(length=20)
	private Date birthday; // 出生日期
	@Column(length=10)
	private String sex; // 性别
	@Column(length=20)
	private String email; // 邮箱 必须真实有效
	@Column(length=11)
	private String telNumber; // 电话号码
	@Column(length=5)
	private String type; // 账户类型
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTureName() {
		return tureName;
	}
	public void setTureName(String tureName) {
		this.tureName = tureName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", password="
				+ password + ", tureName=" + tureName + ", birthday=" + birthday
				+ ", sex=" + sex + ", email=" + email + ", telNumber="
				+ telNumber + ", type=" + type + "]";
	}
	
	

}
