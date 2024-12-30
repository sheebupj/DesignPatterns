package com.paremal.sheebu.observer;

public class Mobile implements Observer {
	Observable observable;
	
	

	public Mobile(Observable observable) {
		super();
		// TODO Auto-generated constructor stub
		this.observable = observable;
		this.observable.register(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(observable.getMessage());
	}

}
