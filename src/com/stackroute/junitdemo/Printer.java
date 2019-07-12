package com.stackroute.junitdemo;

public class Printer {

    private int numberOfPages;

    int numberOfPrintedPages=0;
    float levelOfToner=100;
    private boolean isDuplex;

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }


    public Printer( ) {

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    public void fillToner(){
       levelOfToner=100;
    }
    public void simulatePagePrinting(){
        numberOfPrintedPages++;
        levelOfToner-=0.1;
    }



}
