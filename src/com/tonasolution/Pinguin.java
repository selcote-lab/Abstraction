package com.tonasolution;

public class Pinguin extends Bird {
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not good at that, can I go for swim instead!");
    }
}
