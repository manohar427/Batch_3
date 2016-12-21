package com.test;

public class Mail {

	private Integer id;
	private String mailid;
	private String password;
	public Mail() {
		System.out.println("Mail()");
	}
	public Mail(Integer id,String mailid,String password) {
		this.id= id;
		this.mailid = mailid;
		this.password = password;
		System.out.println("Mail(Integer id,String mailid,String password)");
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
	@Override
	public String toString() {
		return "Mail [id=" + id + ", mailid=" + mailid + ", password="
				+ password + "]";
	}
	
}
