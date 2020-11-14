package com.encapsulation.challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("initial page count " + printer.getNbrPages());
        int pagesPrinted = printer.printPages(8);
        System.out.println("pages " + pagesPrinted + " new total  print count for printer " + printer .getNbrPages());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages " + pagesPrinted + " new total  print count for printer " + printer .getNbrPages());


    }


}
