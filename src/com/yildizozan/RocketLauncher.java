package com.yildizozan;

public class RocketLauncher extends Decorator {
	private Armour armour;

	public RocketLauncher(Armour armour) {
		this.armour = armour;
	}

	@Override
	public String getDescription() {
		return armour.getDescription() + ", Rocket Launcher";
	}

	@Override
	public double cost() {
		return armour.cost() + 150000;
	}

	@Override
	public double weight() {
		return armour.weight() + 7.5;
	}


}
