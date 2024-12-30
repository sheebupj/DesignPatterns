package com.paremal.sheebu.factory_mehtod;

public abstract class TeaShopFactory {
	
	abstract Tea getTea(String item);
	public Tea orderTea(String item){
		Tea tea= getTea(item);
		tea.prepare();
		tea.supply();
		return tea;
	}
	

}
