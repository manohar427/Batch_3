package com.test;

public class Mail {

	private Integer id;
	private String mailid;
	private String password;
	
	public Mail(Integer id,String mailid,String password) {
		this.id= id;
		this.mailid = mailid;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
