public class number {


    public static void check(int checknumber)
    {
        if(checknumber>0)
        {
            System.out.println("the number is positive");
        }
        else if(checknumber<0)
        {
            System.out.println("the number is negative ");
        }
        else
            System.out.println("the number is Null");
    }

    public static long toMilesPerHour(double KilometersPweHour) {
        if(KilometersPweHour<= 0 )
        {
            return -1;
        }
        else {
            return Math.round(KilometersPweHour/ 1.609);
        }

    }

    public  static  void printconversion(double kmPerHours)
    {
        if (kmPerHours<=0)
        {
            System.out.println("invalid value ");
        }
        else
        {
            long milesPerHours= toMilesPerHour(kmPerHours) ;
            System.out.println(kmPerHours + " km/h " + milesPerHours +"mi/h");

        }
    }
}
