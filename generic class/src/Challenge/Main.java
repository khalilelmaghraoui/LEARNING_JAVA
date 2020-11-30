package Challenge;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> teamLeague = new League<>("lega");
        Team<FootballPlayer> FCB = new Team<>("fcb");
        Team<FootballPlayer> RMA = new Team<>("RMA");
        Team<FootballPlayer> RCA = new Team<>("RCA");
        teamLeague.add(FCB);
        teamLeague.add(RMA);
        teamLeague.add(RCA);
        FCB.matchResults(RMA , 5,1);
        FCB.matchResults(RCA , 0,5);
        RMA.matchResults(RCA,1,5);

        teamLeague.showLeagueTable();



    }
}
