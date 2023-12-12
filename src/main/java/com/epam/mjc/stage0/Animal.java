package com.epam.mjc.stage0;


public class Animal {

    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawOrPaws = (numberOfPaws == 1) ? "paw" : "paws";
        String furDescription = hasFur ? "a fur" : "no fur";

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawOrPaws + " and " + furDescription + ".";
    }
}
