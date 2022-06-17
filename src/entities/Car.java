package entities;

import color.Enum.Color;

public abstract class Car {

	protected Integer numbersOfDoor;
	protected Color color;
	protected Double weight;
	protected String brand;
	protected String model;
	protected Integer year;
	
	protected Double Rent;

	public Car(Color color) {
		this.color = color;
	}
	
	public Integer getNumbersOfDoor() {
		return numbersOfDoor;
	}

	public void setNumbersOfDoor(Integer numbersOfDoor) {
		this.numbersOfDoor = numbersOfDoor;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getRent() {
		return Rent;
	}

	public void setRent(Double rent) {
		Rent = rent;
	}

	public abstract Double rentACar(Integer days);
	
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Especifications: \n");
		sb.append("Numbers of Door: " + numbersOfDoor + "\n");
		sb.append("Weight: " + weight + "kg\n");
		sb.append("Brand: " + brand + "\n");
		sb.append("Model: " + model + "\n");
		sb.append("Year: " + year + "\n");
		sb.append("Color: " + color);
		return sb.toString();
	}

	
}
