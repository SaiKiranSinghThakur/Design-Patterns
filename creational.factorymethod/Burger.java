package factorymethod;

import java.util.ArrayList;

abstract class Burger {
	String name;
	String bread;
	String sauce;

	ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparing: ");
	}

	void cook() {
		System.out.println("Cooking: ");
	}

	void serve() {
		System.out.println("serving: ");
	}

	public String getName() {
		return name;
	}

}
