package com.skilldistillery.foodtruck.entities;

public class Foodtruck {
//	This main FoodTruckApp does NOT pass inthe id value for any foodtruck. that will happen here
	private static int nextTruckId;

	private String name;
	private String foodType;
	private int id = 0;
	private int rating = 0;
	private int counter;
	
	public Foodtruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		Foodtruck.nextTruckId++;
		this.id = nextTruckId;
	}
	public Foodtruck() {
		id = counter++;
	}
//	 Print out the trucks info
	public String toString() {
		return "";
	}

	public Foodtruck[] getFoodTruck() {
		Foodtruck[] nextTruckId = new Foodtruck[id];
		
	}
	public static int getNextTruckId() {
		return nextTruckId;
	}
	public static void setNextTruckId(int nextTruckId) {
		Foodtruck.nextTruckId = nextTruckId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}



}

//instantiate the foodtrucks, look at parking lot! (;