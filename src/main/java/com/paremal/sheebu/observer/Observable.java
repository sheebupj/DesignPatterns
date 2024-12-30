package com.paremal.sheebu.observer;

public interface Observable {
	public void register(Observer observer);
	public void remove(Observer observer);
	public void notifyObservers();
	public String getMessage();
}
