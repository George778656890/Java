//Multiple-Choice exam grading

import java.util.Scanner;
import java.io.File;

public class Lab9_3 {

    public static void main(String args[]) throws Exception {

        // create Scanner object to obtain input from file
        Scanner inputFile = new Scanner(new File("QuizData.txt"));

        //reserve some spaces for variable
        String quizName, studentName;
        String answerKey, quizAnswer;
        int cycle1 = 0;//the number of quizzes to grade
        int cycle2 = 0;//length of answerKey
        int sum = 0;

        //get the quiz name and display it
        quizName = inputFile.nextLine();
        System.out.println(quizName);
        System.out.println();

        //get the number of quizzes to grade and quizKey
        cycle1 = inputFile.nextInt();
        answerKey = inputFile.next();
        cycle2 = answerKey.length();//use the length of answerKey to control the inspection loop

        for (int i = 0; i < cycle1; i++) {
            quizAnswer = inputFile.next();
            studentName = inputFile.nextLine();
            int correctNumber = 0;

            for (int j = 0; j < cycle2; j++) {

                char tmp1 = answerKey.charAt(j);
                char tmp2 = quizAnswer.charAt(j);
                if (tmp1 == tmp2) {
                    correctNumber++;
                }

            }
            sum = sum + correctNumber;
            System.out.println(correctNumber + ":" + studentName);
        }
            System.out.println();

        //compute and display the average
        double average = ((double) sum) / ((double) cycle1);
        System.out.printf("Class Average =%5.2f\n", average);

    }
}
