package com.qsp.hasArelation;

class Room {
	String name;

	Room(String name) {
		this.name = name;
	}
}

class House {
	private final Room livingRoom; // house "owns" room (composition)

	House() {
		// room is created *inside* House, not passed in
		this.livingRoom = new Room("Living Room");
	}

	void describe() {
		System.out.println("House with a " + livingRoom.name);
	}
}

public class CompositionRelation {
	public static void main(String[] args) {
		House house = new House();
		house.describe();

		// if house gets destroyed, its Room gets destroyed with it
		// if there is no external reference to livingRoom to keep it alive
		house = null;
	}
}