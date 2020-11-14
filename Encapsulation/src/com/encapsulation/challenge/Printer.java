package com.encapsulation.challenge;

public class Printer {
    private int tonerField;
    private int nbrPages;
    private boolean duplexPrinter;

    public Printer(int tonerField, boolean duplexPrinter) {
        if(tonerField >-1 && tonerField <=100 ){
            this.tonerField=tonerField;
        }else
        {
            this.tonerField=-1;
        }
        this.tonerField = tonerField;
        this.nbrPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillUpToner(int toner){

        if(toner > 0  && toner <=100)
        {
            if(this.tonerField+toner>100){
                return -1;
            }
            this.tonerField+=toner;
            return this.tonerField;

        }else {
            return -1;
        }


    }
    public int printPages(int pages ){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint/= 2;
            System.out.println("duplex mode ");
        }
        this.nbrPages += pagesToPrint;
        return pagesToPrint;

    }
    public int getNbrPages(){
        return nbrPages;
    }


}
