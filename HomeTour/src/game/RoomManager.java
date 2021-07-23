package game;

import fixtures.Room;

import fixtures.Fixture;

public class RoomManager {
	
	public Room startingRoom;
	Room[] rooms = new Room[2];

	
	public RoomManager() {
		super();
	
	}
		// TODO Auto-generated constructor stub
	

	public void init() {
		Room bathroom = new Room(
				"Bathroom","Your personal bathroom","You wake up and find out you ate a toxic jungle berry and passed"
						+ "out. You drink the antidote from the cabinet, and are ready to explore the house.");
		
		this.rooms[0] = bathroom;
		
		Room livingroom = new Room("living room", "your living room", "heehee");
		this.rooms[1] = livingroom;
		this.startingRoom = livingroom;

		
		livingroom.exitDirection[0] = bathroom;
		bathroom.exitDirection[1] = livingroom;
		
		//Room balcony = new Room("br", "sleep", "time to sleep");
		//this.rooms[2] = balcony;
		
		//Room[] bathroomExits = {null, livingroom, null, null};
		//athroom.setExits(bathroomExits);
		
		//Room[] livingroomExits = {bathroom, 
		}
		

		public Room getStartingRoom() {
			return this.startingRoom;
			
			

		}
		public Room getCurrentRoom() {
			return startingRoom;
			
		}
		public void setStartingRoom(Room startingRoom) {
			this.startingRoom = startingRoom;
			
		}
		public Room[] getRooms() {
			return this.rooms;
		}
		public void setRooms(Room[]rooms) {
			this.rooms = rooms;
		}
		
		
		
		



}
