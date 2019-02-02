package com.jeessu.pattern.flyweight.shapeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlyweightPatternDemo {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) throws IOException {


		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
		System.out.println("----------------------------");
		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
//			circle.setX(getRandomX());
//			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
		System.out.print("Input somthing please:");
		String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println("in="+in);
		
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
