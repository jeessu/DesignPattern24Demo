package com.jeessu.pattern.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
 * 解释器模式
 * 比较少用
 * 输入公式a+b-c
 * 然后输入对应的数值  即可计算出结果
 * 
 * 有点意思 有时间可以研究一下 
 * @author lujunjie 
 *
 * created time:2018年9月18日下午4:21:16
 *
 */
public class Client {

	// 运行四则运算
	public static void main(String[] args) throws IOException {
		String expStr = getExpStr();
		// 赋值
		HashMap<String, Integer> var = getValue(expStr);
		Calculator cal = new Calculator(expStr);
		System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
	}

	// 获得表达式
	public static String getExpStr() throws IOException {
		System.out.print("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// 获得值映射
	public static HashMap<String, Integer> getValue(String exprStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 解析有几个参数要传递
		for (char ch : exprStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				// 解决重复参数的问题
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("请输入["+ch+"]的值：");
					String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		new BufferedReader(new InputStreamReader(System.in)).readLine();
		return map;
	}
}
