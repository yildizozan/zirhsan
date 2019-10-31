package com.yildizozan;

public abstract class Armour {
	String description = "Unknown";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public abstract double weight();
}
