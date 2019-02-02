package com.jeessu.pattern.flyweight;
/**
 * 主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 * 享元模式
 */
public class Client {

	public static void main(String[] args) throws InterruptedException {

		// 初始化对象池
		for (int i = 0; i < 4; i++) {
			String subject = "科目" + i;
			// 初始化地址
			for (int j = 0; j < 3000; j++) {
				String key = subject + "考试地点" + j;
				Thread.sleep(10);
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
		Thread.sleep(100000);
	}

}
