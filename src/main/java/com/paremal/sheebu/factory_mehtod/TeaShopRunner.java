package com.paremal.sheebu.factory_mehtod;

public class TeaShopRunner {
	public static void main(String[] args) {
		TeaShopFactory teaShop= new Saravanabhavan();
		Tea tea= teaShop.getTea("madrasTea");
		tea.prepare();
		tea.supply();
	}

}
