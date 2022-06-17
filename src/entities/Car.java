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
	
	protected Integer velocity;

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
	
	public void speedUp() {
		System.out.println("First march");
		for(velocity = 0; velocity <= 20; velocity++) {
			System.out.println(velocity + " km");
				if (velocity >= 20) {
					System.out.println("\nSecond march");
					for (velocity = 20; velocity <=40; velocity++) {
						System.out.println(velocity + " km");
					}
						if(velocity >= 40) {
							System.out.println("\nThird march");
							for(velocity = 40; velocity <= 60; velocity++) {
								System.out.println(velocity + " km");
							}
								if(velocity >= 60) {
									System.out.println("\nFourth march");
									for(velocity = 60; velocity <= 80; velocity++) {
										System.out.println(velocity + " km");
								}
										if(velocity >= 80) {
											System.out.println("\nFifith march");
											for(velocity = 80; velocity <= 100; velocity++) {
												System.out.println(velocity + " km");
											}
										}
							}
						}
				}
				
		}
	}
	
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
