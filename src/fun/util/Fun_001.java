package fun.util;

import java.util.Scanner;

public class Fun_001 {
	// A program to read and display name using scanner.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	   //creating an object of scanner class
	      Scanner scanner = new Scanner(System.in);
		 //declararing and initializing of test variable
		  String text= "Please enter your name";
		  //displaying information
		  System.out.println(text);
		  //collecting input value typed by the user
		  String name = scanner.nextLine();
		  //displaying name entered by the user 
		  System.out.println(name);
	
	}

}
