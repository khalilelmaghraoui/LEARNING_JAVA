package Challenge;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        League<Team<FootballPlayer>> teamLeague = new League<>("lega");
//        Team<FootballPlayer> FCB = new Team<>("fcb");
//        Team<FootballPlayer> RMA = new Team<>("RMA");
//        Team<FootballPlayer> RCA = new Team<>("RCA");
//        teamLeague.add(FCB);
//        teamLeague.add(RMA);
//        teamLeague.add(RCA);
//        FCB.matchResults(RMA , 5,1);
//        FCB.matchResults(RCA , 0,5);
//        RMA.matchResults(RCA,1,5);
//        //Team khail = new Team("khalil");
//
//
//        teamLeague.showLeagueTable();

        double x1 = 1e200, x2 = 1e210 ;
        double y, z ;
        y = x1*x2 ;
        System.out.println("valeur de y " + y) ;
        x2 = x1 ;
        z = y/(x2-x1) ;
        System.out.println(y + " divise par " + (x2-x1) + " = " + z) ;
        y = 15 ;
        z = y/(x2-x1) ;
        System.out.println(y + " divise par " + (x2-x1) + " = " + z) ;
        z = (x2-x1)/(x2-x1) ;
        System.out.println((x2-x1) + " divise par " + (x2-x1) + " = " + z) ;
        System.out.println(z + "+1 = " + (z+1)) ;
        x1 = Float.POSITIVE_INFINITY;
        x2 = Double.NEGATIVE_INFINITY;
        z = x1/x2 ;
        System.out.println(x1 + "/" + x2 + " = " + z) ;
        

    }
}
