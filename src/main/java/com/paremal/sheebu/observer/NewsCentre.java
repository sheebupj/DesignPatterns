package com.paremal.sheebu.observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewsCentre implements Observable {
	List<Observer> obeserverMobileList = new ArrayList<>();
	private String message;

	public String getMessage() {
		return message;
	}

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		obeserverMobileList.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		obeserverMobileList.remove(observer);

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		Iterator<Observer> observersIters = obeserverMobileList.iterator();
		while(observersIters.hasNext()){
			Observer observer = observersIters.next();
			observer.update();
		}

	}
	
	public void changeMessage (String str){
		message = str;
		notifyObservers();
	}

}
