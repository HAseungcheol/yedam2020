package com.yedam.ha.classes;

public class Account {
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance; //금액
	}


	private String ano;
	private String owner; 
	private int balance;
	public String getAno() {    //private 때문에 소스에 들어가서 값 가져온다
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;  //원래 계좌에 있는잔액
	}
	public void setBalance(int amount) { //입금
		if(amount>=10 && amount <=100000) {
			balance=balance+amount;  //10원부터 십만원 까지 넣을수 있음
		}else {
			balance=balance+0; //입금 안할경우
		}
	}
	public void withdrawBalance(int amount) { //출금
		if(amount>=10 && amount <=10000) {
			balance=balance-amount;  //10원부터 십만원 까지 넣을수 있음
		}else {
			balance=balance-0; 
		}
	}
	
	
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
		
}
