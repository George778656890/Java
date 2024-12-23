//Using Arrays for Statistics Fun

import java.util.Scanner;

public class Lab10_4 {

    public static void main(String args[]) {

        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        //reserve some spaces for variables
        int userRange;
        int count = 1;
        boolean[] conditionRegister;

        //display the title of program
        System.out.println("Using Arrays for Statistics Fun\n");

        //prompt user  to input and get data from user
        System.out.print("What is the range of values you wish to test 0 .. ? :");
        userRange = input.nextInt();
        System.out.println();
        conditionRegister = new boolean[userRange + 1];//initialization

        while (true) {

            int number = (int) (Math.random() * (userRange + 1));
            System.out.printf("Number " + "%3d" + " = " + "%3d", count, number);
            System.out.println();

            //compare number and set register status
            for (int i = 0; i <= userRange; i++) {
                if (number == i) {
                    conditionRegister[i] = true;
                }
            }

            //check whether all conditionRegisters are true
            int trueCounter = 1;
            for (int j = 0; j <= userRange; j++) {
                if (conditionRegister[j] == true) {
                    trueCounter++;
                }
            }
            //make sure all the numbers are generated ,end the loop
            if (trueCounter == (userRange + 1)) {
                break;
            }

            count++;
        }

        //print the final result
        System.out.println();
        System.out.println("It took " + count + " draws to pick every value in the range 0 to " + userRange);
    }
}
