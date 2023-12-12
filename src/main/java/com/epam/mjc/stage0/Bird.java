package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super("blue", 2, false);
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
            return "This animals is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and a fur. Moreover, it has 2 wings and can fly.";
        } else {
            return "This animals is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and no fur. Moreover, it has 2 wings and can fly.";
        }
    }
}

