package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double gallons;
        double quarts;
        double pints;
        double cups;
        double tablespoons;
        System.out.print("Enter the number of gallons: ");
        gallons = input.nextDouble();
        System.out.println("In " + gallons + " gallons there are: ");
        quarts = gallons * 4;
        System.out.println(quarts + " quarts");
        pints = quarts * 2;
        System.out.println(pints + " pints");
        cups = pints * 2;
        System.out.println(cups + " cups");
        tablespoons = cups * 16;
        System.out.println(tablespoons + " tablespoons");
    
    }
}