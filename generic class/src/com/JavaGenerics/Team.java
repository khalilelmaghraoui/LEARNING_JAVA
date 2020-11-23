package com.JavaGenerics;

import java.security.PublicKey;
import java.util.ArrayList;

    public class Team<T extends Player > {
        // if we have multiple bounds , we cant add interfaces like Team<T extends Player & interface1 & interface2
        private String  name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;

    private ArrayList<T> members= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + "is already on the team ");
            return  false;
        }
        else {
            members.add(player);
            System.out.println(player.getName() + "added to the team  "+ this.name);
            return true;
        }
    }
    public int numPlayer(){
        return this.members.size();
    }
    public void matchResults(Team opponent , int ourScore , int theirScore){
        if(ourScore > theirScore){
            won++;
        }
        else if(theirScore == ourScore){
            lost++;
        }
        else  {
            tied++;
        }
        if(opponent !=null){
            opponent.matchResults(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return (won *2)+tied;
    }
}
