package com.SpringBoard.Cha.dto;
/*
 * ���̺��=>CHAUSER
  �̸�         ��?       ����            
---------- -------- ------------- 
ID         NOT NULL VARCHAR2(20)  -���̵�
PASSWD              VARCHAR2(200) -��й�ȣ
NAME                VARCHAR2(20)  -�̸�
EMAIL               VARCHAR2(70)  -�̸���
JOIN_DATE           DATE          -ȸ��������
LAST_LOGIN          DATE          -������ �α���
STATUS              NUMBER(1)   -ȸ�� ���� : 1(�Ϲ�ȸ��),9(������)
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
