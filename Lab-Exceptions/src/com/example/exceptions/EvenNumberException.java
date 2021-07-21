package com.example.exceptions;

public class EvenNumberException extends Exception	{

	@Override
	public String getMessage() {
		return "this action is expressly forbidden by the council. no even numbers allowed.";
	}
}
