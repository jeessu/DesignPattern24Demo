package com.jeessu.pattern.decorator;

public class BeautifulAppearance extends Decorator {

	public BeautifulAppearance(Swan swan) {
		// TODO Auto-generated constructor stub
		super(swan);
	}
	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("天鹅叫声很好听。。");
	}
	
	@Override
	public void desAppaearance() {
		// TODO Auto-generated method stub
		System.out.println("天鹅变得很漂亮哦");
	}
	
}
