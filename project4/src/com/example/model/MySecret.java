package com.example.model;

public class MySecret {
	public String amIYourLove(String name){
		name = name.toUpperCase();
		
		if(name.equals("ISHITA"))
			return "Yes, you are my love";
		else
			return "No, you are nothing like love to me.";
		
	}
}