package com.ex5;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private  String breadRollType;

    private String additionalName;
    private double addtionPrice;

    private String additionalName2;
    private double addtionPrice2;

    private String additionalName3;
    private double addtionPrice3;

    private String additionalName4;
    private double addtionPrice4;

    public void additon1(String additionalName , double addtionPrice){
        this.additionalName=additionalName;
        this.addtionPrice=addtionPrice;
    }
    public void additon12(String additionalName , double addtionPrice){
        this.additionalName2=additionalName;
        this.addtionPrice2=addtionPrice;
    }
    public void additon13(String additionalName , double addtionPrice){
        this.additionalName3=additionalName;
        this.addtionPrice3=addtionPrice;
    }
    public void additon14(String additionalName , double addtionPrice){
        this.additionalName4=additionalName;
        this.addtionPrice4=addtionPrice;
    }


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


}

