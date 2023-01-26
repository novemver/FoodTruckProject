package com.skilldistillery.foodtruck.entities;

public class Foodtruck {

	private static int nextTruckId = 0;
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

	@Override
	public String toString() {
		return "Food Truck: " + name + " " + "Food Type: " + foodType + " " + "Rating: " + rating + " " + " " + "I.D.: "
				+ id;
	}

	public int getNextTruckId() {
		return nextTruckId;
	}

	public void setNextTruckId(int nextTruckId) {
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
