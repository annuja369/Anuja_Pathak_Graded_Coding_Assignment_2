package com.question1.driver;

import java.util.Scanner;

import com.question1.stack.SkyscraperStack;

public class SkyscraperMain {

	public static void main(String[] args) {

		// Get total numbers of floors in the building from user.
		System.out.println("Enter the total number of floors in the building : ");
		try (Scanner sc = new Scanner(System.in)) {
			int numberOfFloors = sc.nextInt();
			int[] listOfFloors = new int[numberOfFloors];
			for (int i = 0; i < numberOfFloors; i++) {

				// Get floor sizes from the user.
				System.out.println("Enter the floor size given on day : " + (i + 1));
				int floorSize = sc.nextInt();
				listOfFloors[i] = floorSize;
			}

			// Print the order of construction.
			System.out.println("\nThe order of construction is as follows : \n");
			SkyscraperStack.calculateFloors(listOfFloors);
		}
	}

}