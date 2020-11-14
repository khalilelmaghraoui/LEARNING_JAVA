package com.encapsulation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.name="khalil";
        player.health=14;
        player.weapon="shotgun";
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaining health  = " + player.healthRemaining());


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("khalil",55,"gun");


    }

}
