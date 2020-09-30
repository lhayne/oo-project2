package animals;

import java.util.*;
import behaviors.WakeBehavior;

// ABSTRACTION : This class represents animals generally, but can be overridden by 
// more concrete subclasses.
public class Animal {
	/*
	Animal class
	Attributes : name (String)
				 type (String)
	methods : wake : animal prints wake message
			  makeNoise : animal prints noise message
			  eat : animal prints eating message
			  roam : animal prints roaming message
			  sleep : animal prints sleeping message
			  getName : returns the name of the animal
			  getFullTitle : returns full animal title
	*/

	// ENCAPSULATION : This is an example of encapsulation because declaring these
	// variables private hides them from the inhereting subclasses.
	private String name;
	private String type;
	private behaviors.WakeBehavior performWake;
		
	public Animal(String givenName,String givenType,Boolean fullWake) {
		name = givenName;
		type = givenType;

		// STRATEGY PATTERN : Because marsupials wake up differently, we outsource this function elsewhere
		performWake = new behaviors.WakeBehavior(givenName, givenType, fullWake);
	}
	public void wake() {
		performWake.wake();
	}
	public void makeNoise() {
		System.out.println(name + " the " + type + " makes noise.");
	}
	public void eat() {
		System.out.println(name + " the " + type + " eats.");
	}
	public void roam() {
		System.out.println(name + " the " + type + " roams.");
	}
	public void sleep() {
		System.out.println(name + " the " + type + " sleeps.");
	}
	public String getName() {
		return name;
	}
	public String getFullTitle() {
		return (name + " the " + type);
	}
}