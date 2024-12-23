//InputMismatchException

import java.util.*;

public class Lab7_1 {

    public static void main(String args[]) {
        int userInput1, userInput2;
        int sum;
        boolean correctInput = true;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please input two integers : ");

            try {
                userInput1 = input.nextInt();
                userInput2 = input.nextInt();
                System.out.println("Sum of " + userInput1 + " and " + userInput2 + " is " + (userInput1 + userInput2));
                correctInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input !!! ");
                input.nextLine();//clear input buffer
            }

        } while (correctInput);

    }
}
