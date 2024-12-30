package com.paremal.sheebu.factory_mehtod;

import java.util.List;

public abstract class Tea {
	String name;
	List<String> ingrediance;
	void prepare() {
		System.out.println("Preparing " + name);
		
		for (int i = 0; i < ingrediance.size(); i++) {
			System.out.println("   " + ingrediance.get(i));
		}
	}
	void supply(){
		System.out.println(name + " supply");
	}
}
