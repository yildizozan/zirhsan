package com.yildizozan;

public class Tor extends Armour {

	public Tor() {
		this.description = "Tor";
	}

	@Override
	public double cost() {
		return 5000000;
	}

	@Override
	public double weight() {
		return 50;
	}
}
