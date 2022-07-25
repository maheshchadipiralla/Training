package com.JavaProject.Training;

import java.util.HashMap;
import java.util.TreeMap;

public class MappingValues {

	public static void main(String[] args) {
		HashMap<Integer,String> emp = new HashMap<Integer,String>();
		emp.put(9,"mahesh");
		emp.put(10,"raju");
		emp.put(3,"shiva");
		emp.put(16,"ravi");
		System.out.println(emp);
		
		TreeMap<Integer,String> empSorted = new TreeMap<Integer,String>(emp);
		System.out.println(empSorted);
		
		
	}

}
