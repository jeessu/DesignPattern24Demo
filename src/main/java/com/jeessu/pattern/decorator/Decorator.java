package com.jeessu.pattern.decorator;

public abstract class Decorator implements Swan {

	Swan swan;
	
	public Decorator(Swan swan) {
		// TODO Auto-generated constructor stub
		this.swan = swan;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		swan.fly();
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		swan.cry();
	}

	@Override
	public void desAppaearance() {
		// TODO Auto-generated method stub
		swan.desAppaearance();
	}

}
