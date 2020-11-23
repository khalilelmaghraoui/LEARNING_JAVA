package com.JavaGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    FootballPlayer khalil = new FootballPlayer("khalil ");
    FootballPlayer misk = new FootballPlayer("misk ");
    //BaseballPlayer misk = new BaseballPlayer("misk ");
    SoccerPlayer abir = new SoccerPlayer("abir ");

    Team<FootballPlayer> maghraoui  = new Team<>("maghraoui team ");
    Team<SoccerPlayer> soccerPlayerTeam = new Team<>("soccer Team");
//    Team<String> stringTeam= new Team<String>("fa");

    maghraoui.addPlayer(khalil);
    maghraoui.addPlayer(misk);

    soccerPlayerTeam.addPlayer(abir);




    }


}
