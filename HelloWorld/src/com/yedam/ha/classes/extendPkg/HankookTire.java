package com.yedam.ha.classes.extendPkg;

public class HankookTire extends Tire {
	public HankookTire(String location, int MaxRotation) {
		super(location, MaxRotation);
	}

	@Override
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation ) {
			System.out.println(location+"HankookTire수명:"+"회"
			+(maxRotation - accumulateRotation)+"회");
			return true;
		}else {
			System.out.println("****"+location+"Tire펑크***");
			return false;
		
	}

	}
}