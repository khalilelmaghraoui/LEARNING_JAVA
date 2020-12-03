package com.Collection;


import jdk.internal.org.objectweb.asm.util.Printer;

import java.util.ArrayList;
import java.util.*;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Theater cinemaRif = new Theater("cinema Rif ",8,10);
        List<Theater.Seat> copyList = new ArrayList<>(cinemaRif.seats);
        printLisst(copyList);

        copyList.get(4).reserve();
        if(cinemaRif.reserveSeat("A05")){
            System.out.println("please pay !");
        }else {
            System.out.println("seat already reserved");
        }
        Collections.reverse(copyList);
        printLisst(copyList);
        printLisst(cinemaRif.seats);

        Collections.shuffle(copyList);
        printLisst(copyList);
        printLisst(cinemaRif.seats);
        Theater.Seat  minSeat = Collections.min(copyList);
        Theater.Seat  maxSeat = Collections.max(copyList);
        System.out.println(minSeat.getSeatNumber());
        System.out.println(maxSeat.getSeatNumber());
        printLisst(copyList);

        sortList(copyList);
        System.out.println("printing sorted list");
        printLisst(copyList);



//        cinemaRif.getSeats();
//        if(cinemaRif.reserveSeat("A10")){
//            System.out.println("Please pay ");
//
//        } else {
//            System.out.println("sorry seat is taken");
//        }

    }
    public static void printLisst(List<Theater.Seat> list ){
        for (Theater.Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================================================");
    }
    public static void sortList(List<? extends Theater.Seat>  list){
        for (int i = 0; i <list.size()-1; i++)
            for (int j = i+1; j <list.size() ; j++) {
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }


            }
    }
}
