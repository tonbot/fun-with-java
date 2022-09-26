package fun.util;

import java.util.Scanner;

public class fun_002 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Fun with an array or Collection objects
		/* Array 
		 * ArrayList
		 * LinkedList 
		 * HashMap
		 * HashSet
		 * */		
		usingArray();
	}
	
	public static void usingArray() {
		//this function make use of Java in built ARRAY
		//creating an array 
		String latestCars[] = {"Maruti Grand Vitara", "Audi A4", "Ferrari 296 GTB", "Citroen C5 Aircross"};
		//finding the lenght of the latestCars
		System.out.println( "The lenght of latextCars is : " + latestCars.length);
		//looping through the array 
	    int i=0;
		for(String car : latestCars) {
			i++;
			System.out.println( i + " . "  + car);
		}
		//getting an element of your choice using scanner input
		System.out.println("From the list of car above select your favorite");
		int favorite  = scanner.nextInt();
		//check user input and outputing message
		if (favorite > 0 &&  favorite <=  latestCars.length ) {
			
			System.out.println("Your favorite car is: " + latestCars[favorite-1] );
		}	
		else {
			System.out.println("Please select number from the above list");
		} 
		   
			
	}
	
    public void usingArrayList() {
		
	}

    public void usingLinkedList() {
	
    }

    public void HashMap() {
	
    }


}
