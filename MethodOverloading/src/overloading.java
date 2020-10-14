public class overloading {

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
            System.out.println("invalid feet or inches");
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
           return -1;
  }
}
