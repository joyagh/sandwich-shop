package com.pluralsight;
import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sandwich Size

        double regularSize = 5.45;
        double largeSize = 8.95;
        double price = 0;

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
        int userAge = input.nextInt();

        if (userAge <= 17){
           price = price * .9;
        } else if (userAge >= 65 ){
            price = price * .8;
        }

        // Loaded Sandwich
        System.out.println("Would you like a loaded sandwich? Y or N");
        String loadedSan = input.next();
        if (loadedSan.equalsIgnoreCase("Yes") || loadedSan.equalsIgnoreCase("Y")){
            if (size.equalsIgnoreCase("Regular")){
                price = price + 1;
            } else if (size.equalsIgnoreCase("Large")){
                price = price + 1.75;
            }

        }
        System.out.println("Total cost: " + price);





    }
}
