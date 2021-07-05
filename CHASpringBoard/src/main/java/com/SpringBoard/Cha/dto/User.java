package com.SpringBoard.Cha.dto;
/*
 * 테이블명=>CHAUSER
  이름         널?       유형            
---------- -------- ------------- 
ID         NOT NULL VARCHAR2(20)  -아이디
PASSWD              VARCHAR2(200) -비밀번호
NAME                VARCHAR2(20)  -이름
EMAIL               VARCHAR2(70)  -이메일
JOIN_DATE           DATE          -회원가입일
LAST_LOGIN          DATE          -마지막 로그인
STATUS              NUMBER(1)   -회원 상태 : 1(일반회원),9(관리자)
 * */
public class User {
	private String id;
	private String passwd;
	private String name;
	private String email;
	private String joinDate;
	private String lastLogin;
	private int status;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
