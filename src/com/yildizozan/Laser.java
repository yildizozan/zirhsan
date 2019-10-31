package com.yildizozan;

public class Laser extends Decorator {
	private Armour armour;

	public Laser(Armour armour) {
		this.armour = armour;
	}

	@Override
	public String getDescription() {
		return armour.getDescription() + ", Laser";
	}

	@Override
	public double cost() {
		return armour.cost() + 200000;
	}

	@Override
	public double weight() {
		return armour.weight() + 5.5;
	}
}
