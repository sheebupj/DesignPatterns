package com.paremal.sheebu.singleton;

public class MySingleTonDoubleChecking {
	private volatile static MySingleTonDoubleChecking mySingleTonDoubleChecking;
	
	private MySingleTonDoubleChecking (){}
	
	private static MySingleTonDoubleChecking getMySigleTonDoubleCheckinng(){
		if(mySingleTonDoubleChecking==null){
			synchronized (MySingleTonDoubleChecking.class) {
				if(mySingleTonDoubleChecking==null){
					mySingleTonDoubleChecking = new MySingleTonDoubleChecking();
				}
			}
		}
		return mySingleTonDoubleChecking;
	}
	public void display(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		MySingleTonDoubleChecking mySingleTonDoubleChecking = MySingleTonDoubleChecking.getMySigleTonDoubleCheckinng();
		
		mySingleTonDoubleChecking.display();
		System.out.println(MySingleTonDoubleChecking.getMySigleTonDoubleCheckinng().toString());
	}
	

}
