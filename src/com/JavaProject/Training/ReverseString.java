package com.JavaProject.Training;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();
		StringBuffer sb = new StringBuffer();
		sb.append(input);
		sb.reverse();
		System.out.println(sb);
		
		/*String str = "Simplilearn";

		String reverse = new StringBuffer(str).reverse().toString();

		System.out.printf("Actual Word: %s, Word after reversing %s", str, reverse);
		*/

	}
}
