package com.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	String id;
	Date enter;
	Date leave;
	
	public Car(String id,Date enter){
		this.id = id;
		this.enter = enter;
	}
	
	public Car(String id,String enter){
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		 
		try {
			Date d = sdf.parse(enter);
			this.enter = d;
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		this.id = id;
		
	}
}
