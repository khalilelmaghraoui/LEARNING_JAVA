package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,10,50);
        Case thecase = new Case("khalil2020","lenovo","100",dimensions);
        Monitor monitor = new Monitor("khalil2021","dell",15,new Resolution(12,21));
        MotherBoard motherBoard = new MotherBoard("bj143","asus",8,8,"v2");
        PC thePc = new PC(thecase,monitor,motherBoard);
        thePc.getMonitor().drawPixel(1500,323,"red");
        thePc.getMotherBoard().loadProgram("windows 10 ");
        thePc.getTheCase().pressPowerButton();
    }
}
