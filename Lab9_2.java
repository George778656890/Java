//Multiple Choice Grading

import java.util.Scanner;

public class Lab9_2 {

    public static void main(String args[]) {

        //creates a Scanner object to obtain input from console window
        Scanner input = new Scanner(System.in);

        //reserve some spaces for variables
        String answerKey, quizAnswer;
        int cycle = 0;
        int correctNumber = 0;

        //prompt user to input answer key
        System.out.print("Enter an answer key :");
        answerKey = input.nextLine().toUpperCase();//get data from input
        System.out.println();
        System.out.print("Enter quiz answers  :");
        quizAnswer = input.nextLine();//get data from input
        quizAnswer=quizAnswer.toUpperCase();
        System.out.println();

        //loop times
        cycle = answerKey.length();

        for (int i = 0; i < cycle; i++) {
            char tmp1 = answerKey.charAt(i);
            char tmp2 = quizAnswer.charAt(i);
            if (tmp1 == tmp2) {
                correctNumber++;
            }
        }
        
        //display the final result
        System.out.println("Quiz score          : "+correctNumber+" out of "+cycle+" correct");
    }
}
