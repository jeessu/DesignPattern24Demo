package com.jeessu.pattern.bridge;

/**
 * 构造函数使用Product类
 * 对于比较不确定的事使用抽象类型
 * @author lujunjie 
 *
 * created time:2018年9月18日上午10:30:47
 *
 */
public class ShanZhaiCorp extends Corp {
	// 产什么产品，不知道，等被调用的才知道
	public ShanZhaiCorp(Product product) {
		super(product);
	}

	// 狂赚钱
	public void makeMoney() {
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}
}
