package com.jeessu.pattern.decorator;

public class StrongBehavior extends Decorator {

	public StrongBehavior(Swan swan) {
		// TODO Auto-generated constructor stub
		super(swan);
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("天鹅能够飞翔。");
	}
	
}
