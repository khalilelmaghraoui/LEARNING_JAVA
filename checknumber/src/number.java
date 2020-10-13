public class number {

    public static void main(String[] args) {

        check(5);
        check(-4);
        check(0);

    }
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
}
