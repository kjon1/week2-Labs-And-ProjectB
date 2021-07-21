package com.example.exceptions;

import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) {
		try {
		getInput();
		}catch (EvenNumberException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void getInput() throws EvenNumberException{
		Scanner sc = new Scanner(System.in);
		
		//get input from user
		System.out.println("you must type in a number and press enter...");
		String line = sc.nextLine();
		System.out.println("You typed: " + line);
		
		//test if number is even and throw exception if true
		if (isEven(line)) {
			try {
		
			
			throw new EvenNumberException();
		}
			catch(EvenNumberException e) {
				e.printStackTrace();
			}
			finally {
				sc.close();
			}
		}
		//close resources
		sc.close();
	}
	public static boolean isEven(String num) {
		//;convert value to a number
		int value = Integer.parseInt(num);
		return (value % 2 ==0);
		
		
	}

}
