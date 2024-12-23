//Lotsa Loops

import java.util.Scanner;

public class Lab9_4 {

    public static void main(String args[]) {
        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        //reserve some spaces for variables
        int pattern, rowNumber;
        char userWilling;

        System.out.println("Pattern Generator Program (PGP)\n");

        do {
            userWilling = 'Y';

            //prompt user to input pattern and read data from user
            System.out.print("Choose a pattern(1-4):");
            pattern = input.nextInt();

            while ((pattern >= 1 && pattern <= 4) != true) {
                System.out.println("Incorrect-must be between 1 - 4\n");
                System.out.print("Choose a pattern(1-4):");
                pattern = input.nextInt();

            }

            //prompt user to input rowNumber and read data from user
            System.out.print("How many rows(3-9)  :");
            rowNumber = input.nextInt();

            while ((rowNumber >= 3 && rowNumber <= 9) != true) {
                System.out.println("Incorrect-must be between 3 - 9\n");
                System.out.print("How many rows(3-9)  :");
                rowNumber = input.nextInt();
            }

            switch (pattern) {
                case 1://Pattern 1 generator
                    for (int i = 1; i <= rowNumber; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    break;
                case 2://Pattern 2 generator
                    for (int i = rowNumber; i > 0; i--) {

                        for (int j = 1; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();

                    }
                    break;
                case 3://Pattern 3 generator(Row Number==Spaces number)
                    for (int i = 1; i <= rowNumber; i++) {
                        for (int j = rowNumber; j > i; j--) {
                            System.out.print("  ");
                        }

                        for (int k = i; k >= 1; k--) {
                            System.out.print(k + " ");
                        }

                        System.out.println();
                    }
                    break;
                case 4://Pattern 4 generator(Formula:rowNumber - (i - 1) to control output of numbers)
                    for (int i = 1; i <= rowNumber; i++) {
                        for (int j = (i - 1); j > 0; j--) {
                            System.out.print(" ");
                        }

                        for (int k = 1; k <= rowNumber - (i - 1); k++) {
                            System.out.print(k);
                        }

                        System.out.println();
                    }
                    break;

            }
            //ask user whether to continue or not
            System.out.print("Do you wish to do another(Y/N)? :");
            userWilling = input.next().toUpperCase().charAt(0);
            if (userWilling == 'N') {
                System.out.println("Thank-you for using -PGP");

            }
        } while (userWilling == 'Y');

    }
}
