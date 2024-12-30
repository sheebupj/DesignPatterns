package com.paremal.sheebu.singleton;

public class MySingleton {
	private static  MySingleton mySingleton;
	private MySingleton(){}
	
	public static MySingleton getMySingleton(){
		if (mySingleton==null){
			mySingleton= new MySingleton();
		}

		return mySingleton;
	}
	public void display(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		MySingleton singleton =MySingleton.getMySingleton();
		singleton.display();
	}

}
