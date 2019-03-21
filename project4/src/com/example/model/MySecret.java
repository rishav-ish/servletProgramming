package com.example.model;

public class MySecret {
	public String amIYourLove(String name){
		name = name.toUpperCase();
		
		if(name.equals("ISHITA"))
			return "Hello, Ishita ... the most beautiful girl in this world.";
		else
			return "Hello, " + name;
		
	}
}