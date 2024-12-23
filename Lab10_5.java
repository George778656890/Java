//Yet more Array processing

public class Lab10_5 {

    public static void main(String args[]) {

        //reserve some spaces for variables
        //int[] list = {3, 18, 30, 11, 49, 14, 53, 14, 14, 27, 56, 98, 12, 61, 87};
        int[] list = new int[15];
        int longestSequence = 0;
        int location = 0;
        int count = 1;

        //print the title of program
        System.out.println("Yet more Array processing\n");

        //generate random numbers and initialization,print
        System.out.print("List is ");

        for (int i = 0; i < 15; i++) {

            list[i] = (int) (Math.random() * 99 + 1);
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");

        //compare and compute the longest sequence
        int j;//global variables ,for the last manual comparison of array ending
        for (j = 1; j < 15; j++) {

            if (list[j - 1] <= list[j]) {
                count++;

            } else {
                if (count > longestSequence) {
                    longestSequence = count;
                    location = j;
                    count = 1;//reset the counter
                } else {
                    count = 1;//only reset the counter
                }

            }
        }
        //last comparison of array ending ,compare manually
        if (count > longestSequence) {
            longestSequence = count;
            location = j;
        }
        //print the final result
        System.out.println("Longest Sequence is " + longestSequence);
        System.out.println("Location is " + (location - longestSequence));
        System.out.println();

        System.out.print("Sequence Values are ");
        for (int k = location - longestSequence; k < location; k++) {
            System.out.print(list[k] + " ");
        }
        System.out.println();
    }
}
