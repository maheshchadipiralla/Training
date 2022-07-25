package com.JavaProject.Training;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		String TodayDate = dateFormat.format(new Date());
		System.out.println(TodayDate);

	}

}
