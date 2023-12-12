package com.epam.mjc.stage0;

public class Dog extends Animal {
    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super("brown", 4, true);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor("blue");

    }

    public int getNumberOfPaws() {
        return super.getNumberOfPaws();
    }

    public void setNumberOfPaws(int numberOfPaws) {
        super.setNumberOfPaws(2);
    }

    public boolean getHasFur() {
        return super.getHasFur();
    }

    public void setHasFur(boolean hasFur) {
        super.setHasFur(false);
    }


    public String getDescription() {
        if (this.getHasFur()) {
            return "This animals is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and fur.";
        } else {
            return "This animals is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and no fur.";
        }
    }
}

