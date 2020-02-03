package com.yedam.ha.classes.extendPkg;

public class DmbCellPhone extends Cellphone {
	int channel;
	public DmbCellPhone() {
		super();
	}
	public DmbCellPhone(String model, String color, int channel) { // 생정자 소스에서 using 필드  선택
		super(model, color); //부모를 클래스
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널:"+channel+"번 DMB방송 수신");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB종료");
	}
}
