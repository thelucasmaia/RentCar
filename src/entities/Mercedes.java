package entities;

import color.Enum.Color;

public class Mercedes extends Car {
	
	public Mercedes(Color color) {
		super(color);
		numbersOfDoor = 4;
		weight = 1555.00;
		brand = "Mercedes";
		model = "Mercedes-Benz C300 Sport 2.0";
		year = 2020;
	}

	@Override
	public Double rentACar(Integer days) {
		return Rent = 200.0 * days;
	}
	
}
