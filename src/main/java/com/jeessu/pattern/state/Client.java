package com.jeessu.pattern.state;
/**
 * 设计模式之 状态模式
 * @author lujunjie
 *
 * created time:2018年9月17日下午7:31:22
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
