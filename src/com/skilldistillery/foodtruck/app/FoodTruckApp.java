package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

import solutions.Car;

public class FoodTruckApp {

//	fleet of Foodtrucks
private	Foodtruck[] fleet = new Foodtruck[5];

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to The Food Truck App. \nPlease enter the name of the Food Truck. ");
		
		String name = scan.nextLine();
		
		System.out.println("Please enter the type of the food at this Food Truck. ");
		
		String foodType = scan.nextLine();
		 
		System.out.println("Please enter your rating of 1 (Worst) to 5 (Best) this Food Truck. ");
		
		int rating = scan.nextInt();
		
		   Foodtruck Foodtruck = new Foodtruck(name, foodType, rating);
		  getFleet()[i] = Foodtruck;
		   
		
	}


	public Foodtruck[] getFleet() {
		return fleet;
	}


	public void setFleet(Foodtruck[] fleet) {
		this.fleet = fleet;
	}

}
