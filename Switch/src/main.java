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


        // FOR LOOP STATEMENT
        // SUM 3 AND 5 CHALLENGE

        int sum=0;
        int count=0;

        for(int i=1;i<=1000;i++)
        {
            if((i%3==0) && (i%5==0))
            {
                count++;
                sum+=i;
                System.out.println("the number = "+ i);
            }
            if(count==5) break;
        }
        System.out.println("the sum is = " + sum);
       int var = SumDigits(125);
        System.out.println(var);



    }
    public static int SumDigits(int n) {

        if(n<10)
        {
            return -1;
        }
        int sum = 0;

        while (n > 10) {

            sum = sum + n % 10;
            n = n / 10;




        }
        return sum + n;
    }
}
