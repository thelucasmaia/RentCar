package application;

import java.util.Scanner;

import color.Enum.Color;
import entities.BMW;
import entities.Car;
import entities.Chevrolet;
import entities.Mercedes;

public class Program {

	public static void main(String[] args) {

		try {
		Car car = null;
		Scanner sc = new Scanner(System.in);
		Color color;
		System.out.println("WELCOME SIR");
		System.out.print("Attendant - How can I help you?");
		System.out.println();
		System.out.println("Press: \n(1) - Get out store \n(2) - Rent a car \n ");
		System.out.println();
		System.out.print("Waiting for answer: ");
		Integer option = sc.nextInt();
		
		switch(option) {
		case 1: 
			System.out.println("\nOuting of store...");
			System.exit(0);
			break;
		
		case 2:
			System.out.println("\nAttendant - Yes sir, we have three options of cars: (Mercedes, BMW and Chevrolet)");
			System.out.print("Attendant - What's your preference? \n");
			System.out.println();
			System.out.print("Waiting for answer: ");
			sc.nextLine();
			String optionOfCar = sc.nextLine();
			
			switch(optionOfCar) {
			case "Mercedes":
				System.out.println("\nAttendant - Very well");
				System.out.print("Attendant - Choose a color(BLACK, RED, WHITE, GRAY): ");
				color = Color.valueOf(sc.next());
				car = new Mercedes(color);
				System.out.print("\nAttendant - Price's car is $200.00 per day.\nHow much days you'd like? ");
				Integer days = sc.nextInt();
				car.rentACar(days);
			break;
			case "BMW":
				System.out.println("\nAttendant - Nice choose sir");
				System.out.print("Attendant - Choose a color(BLACK, RED, WHITE, GRAY): ");
				color = Color.valueOf(sc.next());
				car = new BMW(color);
				System.out.print("\nAttendant - Price's car is $250.00 per day.\nHow much days you'd like? ");
				days = sc.nextInt();
				car.rentACar(days);
			break;
			case "Chevrolet":
				System.out.println("\nAttendant - Okay sir");
				System.out.print("Attendant - Choose a color(BLACK, RED, WHITE, GRAY): " );
				color = Color.valueOf(sc.next());
				car = new Chevrolet(color);
				System.out.print("\nAttendant - Price's car is $100.00 per day.\nHow much days you'd like? ");
				days = sc.nextInt();
				car.rentACar(days);
			}
		}
		System.out.println("\n" + car + "\nYou paid $" + String.format("%.2f%n", car.getRent()));
		
		sc.close();
		}
		catch (RuntimeException e) {
			System.out.println("\nError");
		}
		}

}
