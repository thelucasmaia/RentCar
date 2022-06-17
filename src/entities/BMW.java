package entities;

import color.Enum.Color;

public class BMW extends Car {

	public BMW(Color color) {
		super(color);
		numbersOfDoor = 4;
		weight = 1525.00;
		brand = "BMW";
		model = "BMW 320i GP 2.0";
		year = 2022;
	}
	
	@Override
	public Double rentACar(Integer days) {
		return Rent = 250.0 * days;
	}
}
