public class overloading {

    private static final String INVALID_VALUE_MESSAGE="INVALID VALUE !"; // final means that we cannot change the value of the cst //
    public static void main(String[] args) {

//        clculFeetAndInchesToCentimeter(6,6);
        clculFeetAndInchesToCentimeter(100);

    }

    public static double clculFeetAndInchesToCentimeter(double feet , double inches) {

        if (feet >= 0 &&( (inches >= 0 )&& (inches < 12))) {

            double Cm=feet*30.48+inches*2.54;
            System.out.println( feet + "  feet " + inches +"inches = cm = " + Cm);
            return Cm;
        }
        else
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;

    }
   public static double clculFeetAndInchesToCentimeter(double inches) {

       if (inches >= 0 ) {

           double Feet=  (int)inches / 12 ;
           double remainginches= (int) inches %12;

            System.out.println( inches +"inches is equal to  " + Feet);
           return clculFeetAndInchesToCentimeter(Feet,remainginches);
       }
        else
           System.out.println(INVALID_VALUE_MESSAGE);
           return -1;
  }
}
