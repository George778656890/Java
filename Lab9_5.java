//Pyramid shapes

import java.util.Scanner;

public class Lab9_5 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        //reserve some spaces for variables
        char userWilling;
        int rowNumber;

        System.out.println("Pyramid shapes Program (PSP)\n");

        do {
            userWilling = 'Y';

            //prompt user and read data from user
            System.out.print("How many rows in your pyramid (3-9):");
            rowNumber = input.nextInt();

            while ((rowNumber >= 3 && rowNumber <= 9) != true) {
                System.out.println("Incorrect-must be between 3 - 9\n");
                System.out.print("How many rows in your pyramid (3-9):");
                rowNumber = input.nextInt();
            }

            //pattern generator(Similar to Pattern 3|Formula i+(i-1)to control output of asterisk)
            for (int i = 1; i <= rowNumber; i++) {
                for (int j = rowNumber; j > i; j--) {
                    System.out.print(" ");
                }

                for (int k = i + (i - 1); k >= 1; k--) {
                    System.out.print("*");
                }

                System.out.println();
            }

            //ask user whether to continue or not
            System.out.print("Do you wish to do another(Y/N)? :");
            userWilling = input.next().charAt(0);
            if (userWilling == 'N') {
                System.out.println("Thank-you for using -PSP");
            }

        } while (userWilling == 'Y');

    }
}
