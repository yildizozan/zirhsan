package com.yildizozan;

public class Ora extends Armour {

	public Ora() {
		this.description = "Ora";
	}

	@Override
	public double cost() {
		return 1500000;
	}

	@Override
	public double weight() {
		return 30;
	}
}
