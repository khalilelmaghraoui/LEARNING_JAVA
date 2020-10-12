public class hello {

    public static void main(String[] args)
    {
        byte A = 64;
        short b= 2000;
        int c= 45;

        long som = 50000+10*(A+b+c);
        System.out.println(som);
        float cc = 5.4f;

        boolean m= true;

        String mystring= "khalil elmaghroauoi ";
        System.out.println(mystring);

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




    }
}

