package com.sreenutech;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"f_name","l_name"})
public class Customer {
	
	@JsonProperty("f_name")
	private String fName;
	@JsonProperty("l_name")
	private String lName;
	@JsonIgnore
	private String title;
	private String mobnum;
	private String emailid;
	private String address;
	private Account account;
	private List<Orders> order;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMobnum() {
		return mobnum;
	}
	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", title=" + title + ", mobnum=" + mobnum
				+ ", emailid=" + emailid + ", address=" + address + ", account=" + account + ", order=" + order + "]";
	}
	
	
}
