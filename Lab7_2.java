//ArrayIndexOutOfBoundsException

import java.util.Scanner;
import java.util.*;

public class Lab7_2 {

    public static void main(String args[]) {
        int userInput;
        int[] array = new int[100];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.print("Please input integer from 0 to 99 :");

        userInput = input.nextInt();

        try {
            System.out.println("The corresponding value is : " + array[userInput]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds ");
        }

    }
}
