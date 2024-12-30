package com.paremal.sheebu.decorator;

public class RetailBag implements Cost {
	Cost cost;
	double profitPercetage;
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost.getCost() + cost.getCost()*profitPercetage;
	}

	public RetailBag(Cost cost, double profitPercetage) {
		super();
		this.cost = cost;
		this.profitPercetage = profitPercetage;
	}
	

}
