public class main {
    public static void main(String[] args) {
        int switchvalue=4;

        switch (switchvalue){
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("the value is 3 or 4 or 5 ");
                break;
            default:
                System.out.println("value was not 1 or 2");
                break;
        }

        char charValue = 'C';

        switch (charValue){
            case 'A':
                System.out.println("the char value was A");
                break;

            case 'C':
                System.out.println("the char was C");
                break;

            case 'B':
                System.out.println("the char was B");
                break;

            case 'D':
                 System.out.println("the value was D");
                 break;
            default:
                System.out.println("Could not find A,B , C, D");

        }

 PrintDayOfTheWeek.PrintDayOfTheWeek(7);







    }
}
