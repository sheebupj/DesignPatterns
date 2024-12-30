package com.paremal.sheebu.factory_mehtod;

public class Saravanabhavan extends TeaShopFactory {

	@Override
	Tea getTea(String item) {
		// TODO Auto-generated method stub
		if(item.equals("madrasTea")){
			return new MadrasTea();
		}
		return null;
	}

}
