package com.Collection;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Theater {
    private final String theaterName;

    private List<Seat>  seats = new ArrayList<>();


    public Theater(String theaterName,int nbRows , int seatsPerRpw) {
        this.theaterName = theaterName;
        int lastRow = 'A' + (nbRows -1);
        for(char row = 'A' ; row<=lastRow ; row++){
            for (int seatNum = 1 ; seatNum <= seatsPerRpw ; seatNum ++)
            {
                double price =12;
                if(row<'D' && (seatNum >=4 && seatNum<=9)) {
                    price = 14.00;
                }
                else if (row>'F' || (seatNum <4 || seatNum >9)) {
                price = 7.00;
            }

                 Seat  seat = new Seat (row + String.format("%02d" , seatNum),price );
                seats.add(seat);

            }

        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber){
        // for the second type
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat >= 0 ){
            return seats.get(foundSeat).reserve();
        }
        else {
            System.out.println("there is no seat " + seatNumber);
            return false;

        }




        // without binary search
//        Seat  requestedSeat = null;
//        for (Seat seat: seats) {
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }

//        }
//        if (requestedSeat==null){
//            System.out.println("there is no seat"+seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();

    }
    public Collection<Seat> getSeat(){
       return seats;
    }
    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved=false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price=price;
        }
        public boolean reserve(){
            if(!this.reserved){
                this.reserved=true;
                System.out.println(seatNumber+" has been reserved ");
                return true;
            }
            else {
                return false;
            }

        }
        public boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("reservation of seat " + seatNumber + "cancelled");
                return true;
            }
            else return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }


        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public double getPrice() {
            return price;
        }
    }

}


