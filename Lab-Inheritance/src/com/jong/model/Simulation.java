package com.jong.model;

public class Simulation {

	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle((short)7, new Engine());
		
		fv.setName("UFO");
		System.out.println(fv.getName());
		
		Airplane sevenfourseven	 = new Airplane((short)7, (short)4);
		sevenfourseven.move(523);
	}
}
