package com.paremal.sheebu.observer;

public class NewsCentreSimulator {
	public static void main(String[] args) {
		NewsCentreSimulator newsCentreSimulator = new NewsCentreSimulator();
		NewsCentre centre = new NewsCentre();
		Observer m1 =new Mobile(centre); 
		Observer m2 =new Mobile(centre); 
		Observer m3 =new Mobile(centre); 
		Observer m4 =new Mobile(centre); 
		Observer m5 =new Mobile(centre); 
		Observer m6 =new Mobile(centre); 
		centre.changeMessage("This is message from news centre");
		centre.changeMessage("This is  New message from news centre");
	}

}
