package com.paremal.sheebu.strategy;

public class VehicleSimulater {
	public static void main(String[] args) {
		Vehicle vehicle = new MarutiAlto();
		vehicle.setGear(new FourGear());
		vehicle.setWeel(new FourWeeler());
		vehicle.showDetails();
		vehicle = new TaTa1510();
		vehicle.setGear(new AutomaticGear());
		vehicle.setWeel(new SixWeeler());
		vehicle.showDetails();
	}

}
