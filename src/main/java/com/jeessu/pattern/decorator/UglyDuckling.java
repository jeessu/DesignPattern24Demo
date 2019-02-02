package com.jeessu.pattern.decorator;

public class UglyDuckling implements Swan{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("---丑小鸭不会飞。。");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("---丑小鸭叫声 咕噜 咕噜");
	}

	@Override
	public void desAppaearance() {
		// TODO Auto-generated method stub
		System.out.println("--丑小鸭 羽毛灰色的");
	}

}
