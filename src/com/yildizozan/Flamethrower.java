package com.yildizozan;

public class Flamethrower extends Decorator {
	private Armour armour;

	public Flamethrower(Armour armour) {
		this.armour = armour;
	}

	@Override
	public String getDescription() {
		return armour.getDescription() + ", Flamethrower";
	}

	@Override
	public double cost() {
		return armour.cost() + 50000;
	}

	@Override
	public double weight() {
		return armour.weight() + 2;
	}
}
