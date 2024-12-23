//Process scores in a text file

import java.util.*;
import java.io.*;

public class Lab7_4 {

    public static void main(String args[]) {
        String userFile;
        int sum = 0;
        int average;
        int counter = 0;

        try {
            Scanner input1 = new Scanner(System.in);

            System.out.print("Please input the file name : ");
            userFile = input1.nextLine();

            File file = new File(userFile);
            Scanner input2 = new Scanner(file);

            while (input2.hasNext()) {
                sum = sum + input2.nextInt();
                counter++;

            }
            input2.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("The total of the scores is : " + sum);
        System.out.println("The average of the scores is : " + sum / counter);
        System.out.println(counter);
       
    }
}
