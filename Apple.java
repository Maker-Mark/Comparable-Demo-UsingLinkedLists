/**
 * This program demonstrates the basic usage of the Comparable 
 * Note that we implement the Comparable interface.
 * This allows us to the use the methods of lists, such as LinkedList,
 *  Usually called ".sort" to sort our list based off of our compareTo criteria.
 *  If we just made a compareTo method, we'd still be able to compare our objects by that
 *  criteria, however we would have to make a method to sort the list...not so toasty sounding, huh?
 * @author Maker-Mark
 *
 */
public class Apple implements Comparable<Apple> {
	private int weight;
	private String variety;
	private Color c; //Nested object, very well could have just been a string

	public Apple(String color, String variety, int weight) 
	{
		this.variety = variety;
		this.weight  = weight;
		c = new Color(color); //makes new nested color object

	}

	/**
	 * The compareTo method for an Apple
	 *  compares the apple's weight and returns a flag 
	 *  to indicate if the weight is greater than, less than or
	 *  equal.
	 */
	@Override
	public int compareTo(Apple other) 
	{
		if (this.weight < other.weight) {
			return -1;
		}
		if (this.weight == other.weight) {
			return 0;
		}
		//flag for this.Apple greater than apple being compared
		return 1; 
	}

	public String toString() {
		return "I am an apple with a color: " + 
				c.getObjColor() + " I am of variety: "  + variety  + 
				" I weigh: " + weight + " ounces." ;
	}

	//Rest of file: simple setters(mutators) and getters(assessors)
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
}