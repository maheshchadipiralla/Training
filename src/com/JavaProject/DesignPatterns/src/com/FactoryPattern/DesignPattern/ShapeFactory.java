package com.FactoryPattern.DesignPattern;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if(shape == null)
			return null;
		if(shape.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shape.equalsIgnoreCase("Triangle"))
			return new Triangle();
		return null;
	}

}
