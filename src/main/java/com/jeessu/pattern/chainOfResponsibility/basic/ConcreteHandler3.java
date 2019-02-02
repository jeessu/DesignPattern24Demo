package com.jeessu.pattern.chainOfResponsibility.basic;

public class ConcreteHandler3 extends Handler {
	// 定义自己的处理逻辑
	protected Response echo(Request request) {
		// 完成处理逻辑
		System.out.println(" ConcreteHandler.3  echo()");
		return null;
	}

	// 设置自己的处理级别
	protected Level getHandlerLevel() {
		// 设置自己的处理级别
		System.out.println(" ConcreteHandler3 getHandlerLevel()");
		return null;
	}
}
