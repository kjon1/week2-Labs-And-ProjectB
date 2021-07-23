package fixtures;

import java.util.Arrays;

public class Room extends Fixture	{
	
	 

	public Room[] exitDirection = new Room[2];



	public Room(String name, String shortDescription, String longDescription) {
	
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}
	/*public Room getNorth() {
		return exits[0];
		
	}
	public Room getSouth() {
		return exits[1];
		
	}*/
	public Room getDirection(String direction) {
		int index = 0;
		if (direction.equals("north")) {
			index = 0;
		}
		else if (direction.equals("south")) {
			index = 1;
			
		}
		return exitDirection[index];
	}
	
	

	//public Room[] getExitDirection() {
		//return exitDirection;
		
	
	public void setExitDirection(Room[] exitDirection) {
		this.exitDirection = exitDirection;
	
	//public Room getExitDirection(String string) {
		// TODO Auto-generated method stub
		//return null;
	//public Room getExitDirection(String string) {
		// TODO Auto-generated method stub
		//return null;
	}
	}


	//@Override
	//public String toString() {}
		
	


