package fun.util;

import java.util.Scanner;

public class Fun_001 {
	// A program to collect user data and display the collected data using.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//variable declaration 
		String fullName; 
		int age;
		String phone;
		
	      //creating an object of scanner class
	      Scanner scanner = new Scanner(System.in);
		  //collecting full name
		  System.out.println("Please enter your full name");
		  fullName = scanner.nextLine();
		  //collecting phone
		  System.out.println("Please enter your phone");
		  phone = scanner.nextLine();
		  //collecting age
		  System.out.println("Please enter your age. e.g(10)");
		  age = scanner.nextInt();
		  
		 
		  //Displaying user collected data
		  System.out.println("\nYour registration is now completed view your details below");
		  System.out.println("Name:" + fullName);
		  System.out.println("Age:" + age);
		  System.out.println("Phone:" + phone);
		  //displaying name entered by the user 
		  
	
	}

}
