package com.JavaGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    FootballPlayer khalil = new FootballPlayer("khalil ");
    FootballPlayer misk = new FootballPlayer("misk ");
    BaseballPlayer miska = new BaseballPlayer("miska ");
    SoccerPlayer abir = new SoccerPlayer("abir ");

    Team<FootballPlayer> maghraoui  = new Team<>("maghraoui team ");
    Team<FootballPlayer> dadi = new Team<>("dadi Team");
    Team<SoccerPlayer> soccerPlayerTeam = new Team<>("soccer Team");
//    Team<String> stringTeam= new Team<String>("fa");

    maghraoui.addPlayer(khalil);
   // maghraoui.addPlayer(miska);
    maghraoui.addPlayer(misk);
maghraoui.matchResults(dadi , 1,0);
        System.out.println("ranking");
        System.out.println(maghraoui.getName() + " : " + maghraoui.ranking());
        System.out.println(dadi.getName() + " : " + dadi.ranking());





    }


}
