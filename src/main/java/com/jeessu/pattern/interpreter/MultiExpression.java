package com.jeessu.pattern.interpreter;

import java.util.HashMap;

public class MultiExpression extends SymbolExpression {

	public MultiExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	// 把左右两个表达式运算的结果加起来
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) * super.right.interpreter(var);
	}

}
