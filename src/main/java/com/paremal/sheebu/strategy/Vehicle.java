package com.paremal.sheebu.strategy;

public abstract class Vehicle {
	Gear gear;
	Weel weel;
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	public void setWeel(Weel weel) {
		this.weel = weel;
	}
	abstract void showDetails();
	

}
