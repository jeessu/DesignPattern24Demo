package com.jeessu.pattern.state;
/**
 * 
 环境角色有两个不成文的约束：
● 把状态对象声明为静态常量，有几个状态对象就声明几个静态常量。
● 环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式。
 * @author lujunjie
 * 
 *
 * created time:2018年9月17日下午7:59:24
 *
 */
public class Context {

	// 定义出所有的电梯状态
	public final static OpenningState openningState = new OpenningState();
	public final static ClosingState closeingState = new ClosingState();
	public final static RunningState runningState = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();

	// 定义一个当前电梯状态
	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		// 把当前的环境通知到各个实现类中
		this.liftState.setContext(this);
	}

	public void open() {
		this.liftState.open();
	}

	public void close() {
		this.liftState.close();
	}

	public void run() {
		this.liftState.run();
	}

	public void stop() {
		this.liftState.stop();
	}
}
