package com.dp.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeFactory {
	private static final Map<String, Shape> circleMap = new ConcurrentHashMap();

	   public static Shape getCircle(String color) {
	      Circle circle = (Circle)circleMap.get(color);

	      if(circle == null) {
	         circle = new Circle(color);
	         circleMap.put(color, circle);
	         System.out.println("Creating circle of color : " + color+"-----------");
	      }
	      return circle;
	   }
	   
	   public static Map<String, Shape> getMap(){
		   return circleMap;
	   }
}