package com.practice.exceptions;

public class LessAgeException extends RuntimeException{
	public LessAgeException() {
		super();
	}
	public LessAgeException(String message) {
		super(message);
	}
}
