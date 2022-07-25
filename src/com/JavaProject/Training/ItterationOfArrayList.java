package com.JavaProject.Training;
import java.util.ArrayList;

public class ItterationOfArrayList { 

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(55);
		numbers.add(88);
		numbers.add(99);
		numbers.add(33);
		numbers.add(55);
		numbers.add(99);
		
		System.out.println("List of numbers in ArrayList - "+numbers);
		System.out.println("Printing list of numbers in ArrayList using for loop");
		for(int i=0; i< numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		String s1 = "mahesh";
		String s2 = new String("mahesh");

		System.out.println(s1==s2);

		System.out.println(s1.equals(s2));
	}

}
