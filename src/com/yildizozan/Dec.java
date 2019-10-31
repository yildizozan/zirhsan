package com.yildizozan;

public class Dec extends Armour {

	public Dec() {
		this.description = "Dec";
	}

	@Override
	public double cost() {
		return 500000;
	}

	@Override
	public double weight() {
		return 25;
	}
}
