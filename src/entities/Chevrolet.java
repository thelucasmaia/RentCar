package entities;

import color.Enum.Color;

public class Chevrolet extends Car {

	public Chevrolet(Color color) {
		super(color);
		numbersOfDoor = 4;
		weight = 1037.00;
		brand = "Chevrolet";
		model = "Chevrolet Onix 1.0";
		year = 2022;
	}
	
	@Override
	public Double rentACar(Integer days) {
		return Rent = 100.0 * days;
	}
}
