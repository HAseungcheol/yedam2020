package com.yedam.ha.classes.extendPkg;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("sky", "white", 10);
		d1.powerOn(); // cellPhone의 매소드
		d1.turnOnDmb();// DMbCellphon메소드
		d1.changeChannel(20);
		d1.turnOffDmb();
		d1.sendMessage("반갑습니다");// cellPhone의 매소드
		d1.receiveMessage("안녕하세요");
		d1.powerOff();

		Cellphone c1 = new DmbCellPhone(); // 자식 인스턴스는 부모인스턴스를 담을 수 있다.
											// 인스터는는 부모 자식을 다 포함하지만 타입이 부모이므로 부모메소드만 사용가능
		if (c1 instanceof DmbCellPhone) {

			DmbCellPhone d2 = (DmbCellPhone) c1; // 강제로 행변환 Casting 해야함, 작은거에서 큰거 담을때
			d2.turnOnDmb();
			d2.changeChannel(40);
			d2.turnOffDmb();
		}

		Cellphone c2 = new Cellphone();
		if (c2 instanceof DmbCellPhone) { // 행변환 할때 체크(instanceof)
			DmbCellPhone d3 = (DmbCellPhone) c2;
		} else {
			System.out.println("casting 불가");
		}
	}
}