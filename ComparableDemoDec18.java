import java.util.LinkedList;
import java.util.Random;
/**
 * This program demonstrates the basic usage of the Comparable 
 * Note that we implement the Comparable interface in the Apple class.
 * This allows us to the use the methods of lists, such as LinkedList,
 *  Usually called ".sort" to sort our list based off of our compareTo criteria.
 *  If we just made a compareTo method, we'd still be able to compare our objects by that
 *  criteria, however we would have to make a method to sort the list...not so toasty sounding, huh?
 * @author Maker-Mark
 */

public class ComparableDemoDec18 {

	public static void main(String[] args) {
		Random rand = new Random(); //I'm an instantiation of a Random object! 
		//  Remember, "rand" is just a variable for my address in memory
		//Note the syntax for a LinkedList (kind of looks like an array list, if you're wondering how they differ(they do), ask me! )
		LinkedList<Apple> aLink = new LinkedList<Apple>();
		int numR,		   //Random number
		    weight,       //Apple's weight
		    result = - 2;// error flag for invalid comparison
		String color, variety;
		for(int i = 0; i < 10; i++ ) {
			// Generate random number from 0 to 10
			numR = rand.nextInt(10); 
			if(numR >= 7) {
				color = "pruple";
				variety = "Macintosh";
				weight = numR;
			} else if(numR >= 2 && numR <= 6) {
				color = "green";
				variety = "Fuji";
				weight = numR;
			} else {
				color = "Red";
				variety = "Honey Crisp";
				weight = numR;
			}
			//Constructing an apple, based on random generated number
			Apple aApple = new Apple(color, variety, weight);
			aLink.add(aApple); 		//Adds apple to linked list

		}
		
		//Print out apple Linked list, to see the random assignment
		System.out.println(aLink.toString());

		/*
		 * This method demonstrates the use of the compareTo method 
		 * of an Apple, using the apple's weight.
		 * Note: Used implicit brackets
		 */
		for( int i = 0; i < 10; i++) {
			numR = rand.nextInt(10);// random item to compareTo
			result = (int) aLink.get(i).compareTo(aLink.get(numR));
			if(result == -1) 
				System.out.println("Apple one is lighter than apple two.");
			else if(result == 0)
				System.out.println("Wowzers! Apple one and two weigh the same! ");
			else if(result == 1)
				System.out.println("Apple one is heavier than apple two.");
			else
				System.out.println("The compareTo didn't return anything, result must be -2, "
						+ "our error flag somthing is terribly wrong!");
		}
		System.out.printf("\n\nNote the output of the current, unsorted, linked list:\n");
		for( Apple e : aLink)
			System.out.println("Weight:" + e.getWeight());

		aLink.sort(null); //Using the compareTo logic that was implemented. 
		// This is why we "implement" comparable, 
		// otherwise you'd have to manually sort the list
		System.out.printf("\nNote the output of the now sorted linked list:\n");
		for( Apple e : aLink)
			System.out.println("Weight:" + e.getWeight());
	} //Thank you for reading my code! Please let me know if you have any questions or suggestions o7s
}
