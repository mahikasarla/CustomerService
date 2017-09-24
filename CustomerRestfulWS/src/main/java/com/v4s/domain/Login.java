package com.v4s.domain;

public class Login {
private String userName;
private String password;
private Integer loginId;

public Integer getLoginId() {
	return loginId;
}
public void setLoginId(Integer userId) {
	this.loginId = userId;
}
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
public String toString() {
	  String user="UserName: "+ userName+
			  "UserId :" +loginId;
	  return user;
}
}
