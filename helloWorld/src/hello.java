public class hello {

    public static void main(String[] args)
    {
        byte A = 64;
        short b= 2000;
        int c= 45;
        if(A<100)
            System.out.println("you got the high score");

        calulatescore(true , 40,4,5);

    }
    public static void calulatescore(boolean GameOver,int score ,int levelComplet , int bonus  ){

        if(GameOver){
            int finalScore=score + (levelComplet*bonus);
            finalScore  +=1000;
            System.out.println("your final score is " + finalScore);
        }

        int results = CaluclHighScorePostion(1500);
        displayHighScoorePosition("khalil ", results);

         results = CaluclHighScorePostion(900);
        displayHighScoorePosition("maghroaui ", results);

         results = CaluclHighScorePostion(400);
        displayHighScoorePosition("samir ", results);

         results = CaluclHighScorePostion(50);
        displayHighScoorePosition("kamil ", results);

    }


    public static void displayHighScoorePosition(String name, int highscorepostion){

        System.out.println(name + "managed to get into position " + highscorepostion + "on high score table ");


    }

    public static  int CaluclHighScorePostion(int PlayerScore){
        if (PlayerScore>=1000)
        {
            return 1;}
        else if (PlayerScore>=500 ){
            return 2;
        }
        else if (PlayerScore>=100  )
        {
            return 3;

        }
        else
        {
            return 4;
        }



    }



}

