package com.yedam.ha.classes.extendPkg;

public class KumhoTire  extends Tire{
	public KumhoTire(String location, int MaxRotation) {
		super(location, MaxRotation);
	}
	@Override
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation ) {
			System.out.println(location+"KumhoTire수명:"+"회"
			+(maxRotation - accumulateRotation)+"회");
			return true;
		}else {
			System.out.println("****"+location+"Tire펑크***");
			return false;
	
	}

}

}
