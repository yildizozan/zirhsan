package com.yildizozan;

public class AutoRifle extends Decorator {

	private Armour armour;

	public AutoRifle(Armour armour) {
		this.armour = armour;
	}

	@Override
	public String getDescription() {
		return armour.getDescription() + ", Auto Rifle";
	}

	@Override
	public double cost() {
		return armour.cost() + 30000;
	}

	@Override
	public double weight() {
		return armour.weight() + 1.5;
	}
}
