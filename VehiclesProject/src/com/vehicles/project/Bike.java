package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}


	public void addWheels(List<Wheel> frontWheel, List<Wheel> backWheel) throws Exception {
		addoneWheel(frontWheel);
		addoneWheel(backWheel);
	}
	public void addoneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel soleWheel = wheels.get(0);

		this.wheels.add(soleWheel);


	}
}
