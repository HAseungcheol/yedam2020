package com.yedam.ha.classes.extendPkg;

public class Friend {
	private String name;
	private String phone;
	
	public String getName() {  //
		return name;
	}
	
	public Friend(String name, String phone) { // using 필드
		super();
		this.name = name;
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override      //to 스트리어링
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	public void showInfo() {
		System.out.println("이름은"+name);
		System.out.println("전화번호는"+phone);
	}
}
