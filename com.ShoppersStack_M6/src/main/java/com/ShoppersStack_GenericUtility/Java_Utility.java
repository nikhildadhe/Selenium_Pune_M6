package com.ShoppersStack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	
	public int generateRandomNumber() {
		
		Random r=new Random();
		int num = r.nextInt(1000);
		return num;
		
	}
	
	public String localDate() {
		
		String value = LocalDate.now().toString().replace("-","");
		return value;
		
	}
	
	public String dateAndTime() {
		
		String time = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
		return time;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		Random r=new Random();
//		int num = r.nextInt(1000);
//		System.out.println(num);
//		
//		String value = LocalDate.now().toString().replace("-","");
//		System.out.println(value);
//		
//		String time = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
//		System.out.println(time);
//		
//	}

}
