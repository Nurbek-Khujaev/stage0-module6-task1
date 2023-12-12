package com.epam.mjc.stage0;

import java.awt.*;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public void Color(String color) {

        System.out.println(color);

    }

    public void NumberOfPaws(int numberOfPaws) {

        System.out.println(numberOfPaws);

    }

    public void HasFur(boolean hasFur) {

        System.out.println(hasFur);

    }


    public String getDescription() {

        if (hasFur) {
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " and a fur";
        } else {
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " and no fur";
        }

    }

}
