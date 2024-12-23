//Using Arrays to find number Sets

import java.util.Scanner;

public class Lab10_3 {

    public static void main(String args[]) {

        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        //reserve some spaces for variables
        int userinput;
        int[] array;
        boolean[] conditionRegister = new boolean[21];

        //print title of program
        System.out.println("Using Arrays to find number sets\n");

        //prompt user and get data
        System.out.print("How many values do you wish to generate:");
        userinput = input.nextInt();
        System.out.println();

        //initialize array and generate random numbers 
        array = new int[userinput];

        System.out.print("Random numbers :");
        for (int i = 0; i < userinput; i++) {
            array[i] = (int) (Math.random() * 21);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        //compute array with conditionRegister and set status
        for (int j = 0; j < userinput; j++) {
            for (int k = 0; k <= 20; k++) {
                if (array[j] == k) {
                    conditionRegister[k] = true;
                }
            }
        }

        //display sets value based on conditionRegister status
        System.out.print("Set values = {");

        for (int m = 0; m < 21; m++) {
            if (conditionRegister[m] ) {
                System.out.print(m+" ");
            }
        }
        System.out.println("}");
    }
}
