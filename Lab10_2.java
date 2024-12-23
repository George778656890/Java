//Using Arrays to organize odd/even numbers
public class Lab10_2 {

    public static void main(String args[]) {

        //reserve some spaces for variables
        int MAXS = 20;
        int[] initialArray = new int[MAXS];
        int[] evenOddArray = new int[MAXS];
        int randomNumber;
        int indexL = 0;//the starting index of evenOddArray
        int indexR = initialArray.length-1;//the ending index of evenOddArray

        //display the title of program
        System.out.println("Using Arrays to organize odd/even numbers\n");

        //randomly generate 15 numbers and store in array
        System.out.print("Initial\nList=");

        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = (int) (Math.random() * 99 + 1);
            System.out.printf("%3d", initialArray[i]);
        }
        System.out.println("\n");

        //categorize and print out
        for (int j = 0; j < initialArray.length; j++) {
            if (initialArray[j] % 2 == 0) {
                evenOddArray[indexL++] = initialArray[j];
            } else {
                evenOddArray[indexR--] = initialArray[j];
            }
        }
        
        //print the content of evenOddArray
        System.out.print("Even Odd\nList=");
        
        for(int value:evenOddArray){
        System.out.printf("%3d",value);
        }
        System.out.println();
    }

}
