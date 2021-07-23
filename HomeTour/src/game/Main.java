package game;

import java.util.Scanner;

public class Main {
	private static final int menuSelection = 0;
	private static final int e = 0;
	private static final int a = 0;
	static Scanner sc = new Scanner(System.in);
	static String nextAction = "";
	static String escape = "";
	 static Scanner sc2 = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		
		RoomManager manager = new RoomManager();

		manager.init();

		Player player = new Player();
		
		Scanner userInput = new Scanner(System.in);
		
		String input = "";
	
		
		boolean quit = false;
		System.out.println("You are inside a tropical treehouse. You are in the main living room."
				+ "\nIt seems you passed out in the treehouse after climing it, due to exertion. "
				+ "\nThere is a monkey fur rug in the middle of the room, and some coconuts for food."
				+ "\nSuddenly, you hear angry natives shouting and climbing the treehouse ladder!"
				+ "\nQuick, time to escape! There are doors to the north, south, and east.");

		
		while (!quit) {
			printRoom(player);
		
			String[] parsedWords = collectInput();
			parse(parsedWords, player);
			printRoom(player);
			//System.out.println(" Choose to go north, south, or east.");
			input = sc.toString();
			
		

		//while (!quit) {
		System.out.println("Press 'e' to escape treehouse!");
		escape = sc2.toString();
		sc2.nextLine();
		switch(menuSelection) {
		case e:
			System.out.println("You have escaped from the treehouse!");
			quit = true;
			break;
		default:
			System.out.println("You choose to stay in the treehouse.");
			
				
		break;
			
		}
		}
		
			
			
		
		if(quit) {
			System.out.println("Hasta la vista baby.");
		}
		
		
	}
	public static void printRoom(Player player) {
		//System.out.println(player.currentRoom.getName());
		//System.out.println(player.currentRoom.getLongDescription());
	}
	private static String[] collectInput() {
		String[] options = null;
		System.out.println("Where to?");
		nextAction = sc.nextLine();
		options = nextAction.split(" ");
		return options;
		
		
		
	}
	private static void parse(String[] command, Player player) {
		
		String action = command[0];
		String direction = command[1];
		if (action.equals("go")) {
			if (direction.equals("north")) {
				System.out.println("You selected the North exit. You have entered your bathroom."
						+ "The bathroom is very white and smells like clean fragrance. "
						+ "\nThere is a pet"
						+ " turtle in a glass cage above the toilet. "
						+ "\nThe bathroom window is ajar. There is a special forces"
						+ "\nzipline for fast escape.");
				
				System.out.println("Press \"ENTER\" to climb out window.");
				Scanner enterkey = new Scanner(System.in);
				enterkey.nextLine();
			
				//player.currentRoom = player.currentRoom.getExitDirection("north");
			}
			if (direction.equals("south")) {
				System.out.println("You selected the South exit, and have entered the patio."
						+ "\nThe patio has a view of the jungle and you hear monkeys fighting."
						+ "\nThere is a hang glider for quick escape from the treehouse.");
				//player.currentRoom = player.currentRoom.getExitDirection("south");
				System.out.println("Press \"ENTER\" to ride hang glider.");
				Scanner enterkey = new Scanner(System.in);
				enterkey.nextLine();
				//System.out.println("Press 'e' to escape treehouse, or press \"ENTER\" to stay in treehouse");
				
				
					
				
				}
			if (direction.equals("east")) {
				System.out.println("You selected the east exit. You have entered the kitchen."
						+ "\nThe kitchen smells like fried plantain and smoked monkey meat."
						+ "\nThere is a thick strong vine hanging on the kitchen window, so you can swing like Tarzan.");
			}
				
			}
			
		}
		
	}


