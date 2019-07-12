package com.stackroute.junitdemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer();
        int tonerLevel=100;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Is the printer duplex: ");
        boolean type= scanner.nextBoolean();
        if(type==false)
        {
            printer.setDuplex(true);
        }
        System.out.println("Is it duplex: "+printer.isDuplex());
        System.out.println("Enter the number of pages u need to print:");
        int pages=scanner.nextInt();
        for(int i=0;i<pages;i++)
        {
            printer.simulatePagePrinting();
        }

        System.out.println("Number of pages printed: "+printer.numberOfPrintedPages);

        System.out.println("Level of Toner: "+printer.levelOfToner);

    }
}
