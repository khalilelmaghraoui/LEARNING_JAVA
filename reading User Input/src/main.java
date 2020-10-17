import java.util.Scanner;

public class main {
    public static void main(String[] args) {


//        System.out.println("Put Your Year Of Birth ");
//        int birth = scanner.nextInt();
//        scanner.nextLine(); // to read Enter
//
//        System.out.println("your Name ");
//        String name = scanner.nextLine();
//
//
//
//        System.out.println("Your name "+ name);
//        System.out.println("your age " + birth);
        MinAndMaxInputChallenge();
    }

    public static void MinAndMaxInputChallenge(){

        Scanner scanner = new Scanner(System.in);
int max=0;
int min = 0;
boolean first = true;


// use an endless while loop


        while (true)

        {

            System.out.println("Enter Number ");
            boolean isAnint =  scanner.hasNextInt();
            if(isAnint)
            {
                int number = scanner.nextInt();
                if(first){
                    first= false;
                    min=number;
                    max = number;
                }

                if(number>max)
                {
                    max = number ;
                }
                if(number<min)
                {
                    min = number;
                }


            }
            else {
                System.out.println("invalid number ");
                break;

            }
            scanner.nextLine(); // handle the input

        }
        System.out.println("min   = " + min +
            "   \n max  =  " + max  );
        scanner.close();



    }
}
