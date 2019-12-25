package com.sreenutech;

public class Account {

	private double balance;
	private String cardNum;
	private int cvv;
	private String nameOnCard;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", cardNum=" + cardNum + ", cvv=" + cvv + ", nameOnCard=" + nameOnCard
				+ "]";
	}
 
}
