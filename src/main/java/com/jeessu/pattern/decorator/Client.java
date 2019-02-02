package com.jeessu.pattern.decorator;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Swan swan;
//		
//		swan = new UglyDuckling();
//		
//		swan.cry();
//		swan.fly();
//		swan.desAppaearance();
//		System.out.println("\n----------丑小鸭终于发现自己是一只天鹅-----------");
//		swan = new BeautifulAppearance(swan);
//		
//		swan = new StrongBehavior(swan);
//		
//		swan.cry();
//		swan.fly();
//		swan.desAppaearance();
	
		
		// 获取Java线程管理MXBean
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		// 不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		// 遍历线程信息，仅打印线程ID和线程名称信息
		for (ThreadInfo threadInfo : threadInfos) {
		System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.
		getThreadName());
		}
	}

}
