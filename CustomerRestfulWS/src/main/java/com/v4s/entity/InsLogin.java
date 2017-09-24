package com.v4s.entity;

import javax.persistence.*;

@Entity
@Table(name="InsLogin")
public class InsLogin {
	@Id
	@GeneratedValue
	@Column(name="LoginId")
	private Integer loginId;
	
	@Column(name="UserPassword")
	private String password;
	
	@Column(name="UserName")
	private String userName;
	
	public InsLogin() {
		
	}

	public InsLogin(Integer loginId, String password, String userName) {
		this.loginId = loginId;
		this.password = password;
		this.userName = userName;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
