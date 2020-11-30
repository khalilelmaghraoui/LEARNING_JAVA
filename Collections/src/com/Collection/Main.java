package com.Collection;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Theater cinemaRif = new Theater("cinema Rif ",8,10);
        cinemaRif.getSeats();
        if(cinemaRif.reserveSeat("A10")){
            System.out.println("Please pay ");

        } else {
            System.out.println("sorry seat is taken");
        } if(cinemaRif.reserveSeat("A10")){
            System.out.println("Please pay ");

        } else {
            System.out.println("sorry seat is taken");
        }

    }
}
