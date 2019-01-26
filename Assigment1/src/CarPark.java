/**
 *C0320 - Introduction to object-orientated programming
 *Assignment 1: Defining a class
 *Car Park
 *
 *The car park class acts as the barriers at most car parks keeping track of cars as they enter and leave.
 *This class also stores data on the location of the car park, the number of spaces available in total and currently.
 *
 *
 * @author: Raymond Ward
 * 
 *
 * @version: 19/10/2018
 */





public class CarPark {

	private int occupancy;
	private int capacity;
	private String location;
	
	
	/*
	 * Car park constructor
	 * @param occupancy the current number of cars in the car park
	 * @param capacity the current maximum capacity of car park
	 * @param location the name of the current car park object
	 * 
	 */
	public CarPark(String location, int capacity ) {
		this.occupancy = 0;
		this.capacity = capacity;
		this.location = location;
		
		
	}
	
	/*
	 * Method park will increase the occupancy of the car park depending on capacity, therefore a car parking
	 */

	public void park() {
		if (this.occupancy < this.capacity) {
			this.occupancy += 1;
			
		}
		
		else {
			System.out.println("Cark park full, occupancy unchanged");
		}
			
	}
	
	/*
	 * Method leave will decrease the occupancy of the car park depending on capacity, therefore a car leaving
	 */
	
	public void leave () {
		
		if (this.occupancy > 0) {
			this.occupancy -= 1;
		}
		
		else {
			System.out.println("Car park empty, occupancy not changed");
		}
		
	}
	
	/*
	 * Occupancy accessor returns current occupancy
	 */

	public int getOccupancy() {
		return occupancy;
	}


	/*
	 * Capacity accessor returns current capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/*
	 * Location accessor returns current car park location
	 */
	
	public String getLocation() {

		return location;
	}
	
	
		
	/*
	 * Change capacity mutator method allows the capacity to be set
	 * @param capacity the amount the current capacity is to be changed by, may be positive or negative
	 */
	public void changeCapacity(int capacity) {
		
		if (this.capacity + capacity < this.occupancy && this.occupancy != 0) {  //If the occupancy is 0 and a minus value is entered, the first condition
			System.out.println("Change not possible, occupancy too high");       // would be true so second condition is required
			capacity = 0;
			
		}
		
		else if ( this.capacity + capacity <= 0) {
			capacity = -this.capacity;
			System.out.println("Car park is now closed");
		}
		
		
		this.capacity += capacity;
	}
	
	/*
	 * print details method outputs car park details to console
	 */
	public void printDetails () {
		System.out.println(String.format ("%s car park has %d spaces." , this.location, (this.capacity - this.occupancy)));
	}

	
	
}