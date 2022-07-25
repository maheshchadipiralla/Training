package com.JavaProject.Training;
class AreaOfShape{
	int area(int x, int y){
		return x*y;
	}
	int area(int x){
		return x*x;
	}
}

public class MethodOverloading {
	public static void main(String args[]){
		AreaOfShape sa = new AreaOfShape();
		System.out.println("Area of rectangle = "+sa.area(5,6));
		System.out.println("Area of Square = "+sa.area(5));
	}
}