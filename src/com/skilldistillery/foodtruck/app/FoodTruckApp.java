package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {

	private Foodtruck[] fleet = new Foodtruck[5];

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp ft = new FoodTruckApp();
		ft.letsGo();
		ft.theMenu();
	}

	public void letsGo() {

		for (int i = 0; i < 5; i++) {

			System.out.println(
					"Welcome to The Food Truck App. \nPlease enter the name of the Food Truck. (Enter \"quit\" to continue) ");

			String name = scan.nextLine();
			if (name.toUpperCase().equals("QUIT")) {
				break;

			} else {
				System.out.println("Please enter the type of the food at this Food Truck. ");

				String foodType = scan.nextLine();

				System.out.println("Please enter your rating of 1 (Worst) to 5 (Best) this Food Truck. ");

				int rating = scan.nextInt();
				scan.nextLine();

				Foodtruck Foodtruck = new Foodtruck(name, foodType, rating);
				fleet[i] = Foodtruck;
			}
		}

	}

	public void theMenu() {
		System.out.println("Please select an option: ");
		System.out.println("1: List all existing Food Trucks. ");
		System.out.println("2: See the average rating of all food trucks. ");
		System.out.println("3: Display the highest-rated food truck. ");
		System.out.println("4: Quit the program. ");
		int choose = scan.nextInt();
		Boolean keepGoing = true;

		if (keepGoing) {
			switch (choose) {
			case 1:
				listAll(fleet);
				theMenu();
				break;
			case 2:
				avRating(fleet);
				theMenu();
				break;
			case 3:
				highRate(fleet);
				theMenu();
				break;
			case 4:
				System.out.println("Quiting Program. \nThank you for using The Food Truck App! ");
				scan.close();
				keepGoing = false;
				return;
			default:
				System.out.println("Choice not found, please try again. ");
				theMenu();
				break;

			}

		}

	}

	public void listAll(Foodtruck[] fleet) {
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				System.out.println(fleet[i].toString());
			}
		}
	}

	public void avRating(Foodtruck[] fleet) {
		double sumRating = 0;
		double total = 0;
		double count = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				sumRating += fleet[i].getRating();
				count += i;
			}
			total = sumRating / count;

		}
		System.out.println("Average Rating of all Food Trucks: " + " " + ((float) Math.round(total * 10) / 10));
	}

	public void highRate(Foodtruck[] fleet) {
		Foodtruck highestR = fleet[0];
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				if (fleet[i].getRating() > highestR.getRating()) {
					highestR = fleet[i];
				}
			}
		}
		System.out.println(highestR.toString());
	}

	public void endP(Foodtruck[] fleet) {
		System.out.println("You have chosen QUIT. Quiting Program. Thank you for using The Food Truck App! ");
	}
}
