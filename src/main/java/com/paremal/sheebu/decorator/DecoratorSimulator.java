package com.paremal.sheebu.decorator;


public class DecoratorSimulator {
	public static void main(String[] args) {
		Bag bag = new Bag();
		System.out.println("production cost of bag:" + bag.getCost());
		BagWholeSale bagWholeSale = new BagWholeSale(bag, 0.1);
		System.out.println("wholesale price  of bag:" + bagWholeSale.getCost());
		RetailBag retailBag = new RetailBag(bagWholeSale,0.4 );
		System.out.println("Retail price  of bag:" + retailBag.getCost());
	}
}
