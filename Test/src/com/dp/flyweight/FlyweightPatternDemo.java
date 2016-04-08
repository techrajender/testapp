package com.dp.flyweight;

import java.util.LinkedList;
import java.util.List;

public class FlyweightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Blue", "White",
			"Black" };

	public static void main(String[] args) {
		List<Circle> circles = new LinkedList<Circle>();
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle("Red");
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
			circles.add(circle);
			//Circle circle2=circle;
			//System.out.println("before ::"+circle.getX() +" -- "+circle2.getX());
			//circle2.setX(22);
			//System.out.println("before ::"+circle.getX() +" -- "+circle2.getX());
			//circle.setX(i);
			//System.out.println(circle.getX() +" -- "+circle2.getX());
			//System.out.println(circle.hashCode() +" -- "+circle2.hashCode());
		}
		System.out.println(ShapeFactory.getMap().size() + " - "
				+ circles.size());
		
		for (Circle circle : circles) {
			System.out.println(circle.getX());
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
