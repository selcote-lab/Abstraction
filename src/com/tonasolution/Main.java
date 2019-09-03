package com.tonasolution;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkia ");
	    dog.breathe();
	    dog.eat();

	    Parrot parrot = new Parrot("Australian ringmeck");
		parrot.breathe();
		parrot.eat();
		parrot.fly();

		Pinguin pinguin = new Pinguin("Emeperor");
		pinguin.fly();

    }
}
