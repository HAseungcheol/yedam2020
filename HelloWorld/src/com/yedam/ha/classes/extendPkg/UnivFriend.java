package com.yedam.ha.classes.extendPkg;

public class UnivFriend extends Friend {
	private String university;
	
	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		this.university = university;
	}

	public String getUniversity() {  //값을 보여주는거
		return university;
	}

	public void setUniversity(String university) { //값을 입력
		this.university = university;
	}

	@Override
	public void showInfo() {
		
		System.out.println("학교친구 이름은"+ super.getName());
		System.out.println("학교친구 전화번호는"+super.getPhone());
		System.out.println("학교는"+university);
	}

	
	
}
