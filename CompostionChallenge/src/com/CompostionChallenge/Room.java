package com.CompostionChallenge;

public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceilling ceilling;
    private Bed bed ;
    private Lamp lamp;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceilling ceilling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceilling = ceilling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public Lamp getLamp(){
        return this.lamp;
    }
    public void  makeBed(){
        System.out.println("room -> making bed");
        bed.make();
    }

}
