package com.pluralsight;
import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sandwich Size

        double regularSize = 5.45;
        double largeSize = 8.95;
        double price;

        System.out.println("Choose Sandwich Size Regular or Large: ");
        String size = input.next();

        if (size.equalsIgnoreCase("regular")){
            price = regularSize;
        } else if (size.equalsIgnoreCase("large")){
            price = largeSize;
        } else {
            System.out.println("Invalid Response");
        }





        // User age

        System.out.println("Please enter age: ");

    }
}
