package fun.util;

import java.util.ArrayList;
import java.util.LinkedList;
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
		usingArrayList();
		usingLinkedList();
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
		 
		
		//get any array element of your choice using scanner input
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
	
	//this is a method for ArraList
    public static void usingArrayList() {
    	
    	ArrayList<String> latestCars = new ArrayList<String>();
    	//add element into new array object created;
    	latestCars.add("Maruti Grand Vitara");
    	latestCars.add("Audi A4");
    	latestCars.add("Ferrari 296 GTB");
    	latestCars.add("Citroen C5 Aircross");
    	
       //get element 
     	System.out.println(latestCars.get(0));
     	System.out.println(latestCars.get(1));
     	System.out.println(latestCars.get(2));
     	System.out.println(latestCars.get(3));
     	
     	//print array size
     	System.out.println("The size of the array is " + latestCars.size());
     	
     	//remove Element 
     	latestCars.remove(2);
     	
     	//print array size
     	System.out.println("The size of the array is " + latestCars.size());
     	
     	//change element
     	latestCars.set(0,"Honda");
     	int i = 0;
     	//loop through array
    	for(String car : latestCars) {
			i++;
			System.out.println( i + " . "  + car);
		}
	
    	
 
    }
   

    public static void usingLinkedList() {
    	LinkedList<String> latestCars = new LinkedList<String>();
    	//add element into new array object created;
    	latestCars.add("Maruti Grand Vitara");
    	latestCars.add("Audi A4");
    	latestCars.add("Ferrari 296 GTB");
    	latestCars.add("Citroen C5 Aircross");
    	
       //get element 
     	System.out.println(latestCars.get(0));
     	System.out.println(latestCars.get(1));
     	System.out.println(latestCars.get(2));
     	System.out.println(latestCars.get(3));
     	
     	//print array size
     	System.out.println("The size of the array is " + latestCars.size());
     	
     	//remove Element 
     	latestCars.remove(2);
     	
     	//print array size
     	System.out.println("The size of the array is " + latestCars.size());
     	
     	//print the first element of the array
     	System.out.println(latestCars.getFirst());
     	//print the last element of the array
     	System.out.println(latestCars.getLast());
     	//remove first element
     	latestCars.removeFirst();
     	//remove last element
     	latestCars.removeLast();
     	
     	int i = 0;
     	//loop through array
    	for(String car : latestCars) {
			i++;
			System.out.println( i + " . "  + car);
		}
	
    }

    public void HashMap() {
	
    }


}
